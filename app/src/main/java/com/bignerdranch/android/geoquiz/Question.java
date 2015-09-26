package com.bignerdranch.android.geoquiz;

/**
 * Created by garci_000 on 9/20/2015.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean cheater;

    public Question(int textResId, boolean answerTrue)
    {
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

    public void setCheater(boolean cheat)
    {
        cheater = cheat;
    }

    public boolean isCheater()
    {
        return cheater;
    }

}
