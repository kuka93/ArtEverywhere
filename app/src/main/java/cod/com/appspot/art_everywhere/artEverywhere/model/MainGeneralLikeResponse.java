/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-04-28 at 23:00:03 UTC 
 * Modify at your own risk.
 */

package cod.com.appspot.art_everywhere.artEverywhere.model;

/**
 * Model definition for MainGeneralLikeResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the artEverywhere. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MainGeneralLikeResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasLiked;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long likes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasLiked() {
    return hasLiked;
  }

  /**
   * @param hasLiked hasLiked or {@code null} for none
   */
  public MainGeneralLikeResponse setHasLiked(java.lang.Boolean hasLiked) {
    this.hasLiked = hasLiked;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getLikes() {
    return likes;
  }

  /**
   * @param likes likes or {@code null} for none
   */
  public MainGeneralLikeResponse setLikes(java.lang.Long likes) {
    this.likes = likes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * @param message message or {@code null} for none
   */
  public MainGeneralLikeResponse setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  @Override
  public MainGeneralLikeResponse set(String fieldName, Object value) {
    return (MainGeneralLikeResponse) super.set(fieldName, value);
  }

  @Override
  public MainGeneralLikeResponse clone() {
    return (MainGeneralLikeResponse) super.clone();
  }

}