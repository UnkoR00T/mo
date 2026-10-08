package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class q0 implements Parcelable.Creator<p0> {
    static void c(p0 p0Var, Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.d(parcel, 2, p0Var.f36580a, false);
        kg.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p0 createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 2) {
                kg.b.B(parcel, iT);
            } else {
                bundleA = kg.b.a(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new p0(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0[] newArray(int i15) {
        return new p0[i15];
    }
}
