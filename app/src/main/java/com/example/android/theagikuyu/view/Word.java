
package com.example.android.theagikuyu.view;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation,a Kikuyu translation and image resource id  for that word.
 */
public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Kikuyu translation for the word
     */
    private String mKikuyuTranslation;

    /**
     * image resource id  for the word
     */
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    /**
     * image resource id  for the word
     */
    private int mAudioResourceId=NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param KikuyuTranslation   is the word in the Kikuyu language
     */
    public Word(String defaultTranslation, String KikuyuTranslation) {
        mDefaultTranslation = defaultTranslation;
        mKikuyuTranslation = KikuyuTranslation;

    }
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param KikuyuTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Word(String defaultTranslation, String KikuyuTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mKikuyuTranslation = KikuyuTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Kikuyu translation of the word.
     */
    public String getKikuyuTranslation() {
        return mKikuyuTranslation;
    }

    /**
     * Get the image resource id of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the image resource id of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasAudio(){
        return mAudioResourceId != NO_IMAGE_PROVIDED;
    }

}