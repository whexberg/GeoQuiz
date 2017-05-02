package com.thenerdbiker.android.geoquiz;


public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mAttempted = false;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAttempted() {
        return mAttempted;
    }

    public void setAttempted(boolean attempted) {
        mAttempted = attempted;
    }
}
