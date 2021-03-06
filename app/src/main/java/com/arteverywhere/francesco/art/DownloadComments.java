package com.arteverywhere.francesco.art;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;

import cod.com.appspot.art_everywhere.artEverywhere.ArtEverywhere;
import cod.com.appspot.art_everywhere.artEverywhere.model.MainCommentDetailsCollection;

/**
 * Created by Francesco on 11/02/2015.
 */
public class DownloadComments extends AsyncTask<Void, Void, MainCommentDetailsCollection> {
    Context mContext;
    TaskCallbackDownloadComments mCallback;
    String url;

    public DownloadComments(Context context) {
        mContext = context;
    }

    public DownloadComments(Context context, TaskCallbackDownloadComments mCallback, String url) {
        mContext = context;
        this.mCallback = mCallback;
        this.url = url;
    }

    @Override
    protected MainCommentDetailsCollection doInBackground(Void... strings) {
        // Retrieve service handle.
        ArtEverywhere apiServiceHandle = AppConstants.getApiServiceHandle(null);
        try {
            ArtEverywhere.List.Commentlist get = apiServiceHandle.list().commentlist(url);
            MainCommentDetailsCollection greeting = get.execute();
            return greeting;
        } catch (IOException e) {
            Toast.makeText(mContext, "Exception during API call!", Toast.LENGTH_LONG).show();
        }
        return null;
    }

    protected void onPostExecute(MainCommentDetailsCollection greeting) {
        if (greeting!=null) {
            Log.d("SIZE", "" + greeting.size());

            if(greeting.getComments() == null) {
                mCallback.done(new String[0],new String[0],new String[0],new String[0],new String[0], new String[0]);
            }
            else {
                String[] listaCommenti = new String[greeting.getComments().size()];
                String[] listaAutori = new String[greeting.getComments().size()];
                String[] listaDate = new String[greeting.getComments().size()];
                String[] listaPic = new String[greeting.getComments().size()];
                String[] listaEmail = new String[greeting.getComments().size()];
                String[] listaId = new String[greeting.getComments().size()];

                for (int i = 0; i < greeting.getComments().size(); i++) {
                    listaCommenti[i] = greeting.getComments().get(i).getComment();
                    listaDate[i] = greeting.getComments().get(i).getDate();
                    listaEmail[i] = greeting.getComments().get(i).getEmail();
                    listaId[i] = greeting.getComments().get(i).getId();

                    if (greeting.getComments().get(i).getName() != null) {
                        listaAutori[i] = greeting.getComments().get(i).getName();
                    } else {
                        listaAutori[i] = "Visitatore";
                    }

                    if (greeting.getComments().get(i).getPic() != null) {
                        listaPic[i] = greeting.getComments().get(i).getPic();
                    } else {
                        listaPic[i] = "http://www.francescocucari.it/ic_launcher.png";
                    }
                }


                mCallback.done(listaAutori, listaCommenti, listaDate, listaPic, listaEmail, listaId);
            }

        } else {
            Toast.makeText(mContext, "No greetings were returned by the API.", Toast.LENGTH_LONG).show();
        }
    }
}
