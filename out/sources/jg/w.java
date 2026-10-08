package jg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class w extends kg.a {
    public static final Parcelable.Creator<w> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f102565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f102566b;

    public w(int i15, List list) {
        this.f102565a = i15;
        this.f102566b = list;
    }

    public final int h() {
        return this.f102565a;
    }

    public final List m() {
        return this.f102566b;
    }

    public final void p(q qVar) {
        if (this.f102566b == null) {
            this.f102566b = new ArrayList();
        }
        this.f102566b.add(qVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f102565a);
        kg.c.y(parcel, 2, this.f102566b, false);
        kg.c.b(parcel, iA);
    }
}
