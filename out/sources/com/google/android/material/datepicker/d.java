package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface d<S> extends Parcelable {
    Collection<i6.d<Long, Long>> A2();

    boolean A3();

    int D1(Context context);

    Collection<Long> J3();

    S N3();

    String O0(Context context);

    void X3(long j15);

    View i3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, s<S> sVar);

    String v2(Context context);
}
