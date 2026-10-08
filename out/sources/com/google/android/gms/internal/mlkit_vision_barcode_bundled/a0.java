package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        byte[] bArrB = null;
        Point[] pointArr = null;
        s sVar = null;
        v vVar = null;
        w wVar = null;
        y yVar = null;
        x xVar = null;
        t tVar = null;
        p pVar = null;
        q qVar = null;
        r rVar = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    bArrB = kg.b.b(parcel, iT);
                    break;
                case 5:
                    pointArr = (Point[]) kg.b.k(parcel, iT, Point.CREATOR);
                    break;
                case 6:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 7:
                    sVar = (s) kg.b.g(parcel, iT, s.CREATOR);
                    break;
                case 8:
                    vVar = (v) kg.b.g(parcel, iT, v.CREATOR);
                    break;
                case 9:
                    wVar = (w) kg.b.g(parcel, iT, w.CREATOR);
                    break;
                case 10:
                    yVar = (y) kg.b.g(parcel, iT, y.CREATOR);
                    break;
                case 11:
                    xVar = (x) kg.b.g(parcel, iT, x.CREATOR);
                    break;
                case 12:
                    tVar = (t) kg.b.g(parcel, iT, t.CREATOR);
                    break;
                case 13:
                    pVar = (p) kg.b.g(parcel, iT, p.CREATOR);
                    break;
                case 14:
                    qVar = (q) kg.b.g(parcel, iT, q.CREATOR);
                    break;
                case 15:
                    rVar = (r) kg.b.g(parcel, iT, r.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new z(iV, strH, strH2, bArrB, pointArr, iV2, sVar, vVar, wVar, yVar, xVar, tVar, pVar, qVar, rVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new z[i15];
    }
}
