package com.example.activitysharedviews;

import java.io.Serializable;

/*
* Copyright (c) <2016> <Caique Teixeira Brito> https://github.com/CaiqueBrito
* Permission is hereby granted, free of charge, to any person obtaining a copy of this
* software and associated documentation files (the "Software"),
* to deal in the Software without restriction, including without limitation the rights to use,
* copy, modify, merge, publish, distribute, sublicense,
* and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
* subject to the following conditions: The above copyright notice and this permission notice
* shall be included in all copies or substantial portions of the Software.
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
* INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
* IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
* WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
* */
public class AnimationData implements Serializable {
    private int mDuration;
    private int mViewId;
    private int mInterpolator;

    public AnimationData(int viewId, int duration, int interpolator) {
        this.mViewId = viewId;
        this.mDuration = duration;
        this.mInterpolator = interpolator;
    }

    public int getViewId() {
        return mViewId;
    }

    public int getDuration() {
        return mDuration;
    }

    public int getInterpolator() { return mInterpolator; }
}