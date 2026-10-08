package gg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class c extends kg.a {
    public static final Parcelable.Creator<c> CREATOR = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f72725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    private final int f72726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f72727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f72728d;

    public c(String str, int i15, long j15, boolean z15) {
        this.f72725a = str;
        this.f72726b = i15;
        this.f72727c = j15;
        this.f72728d = z15;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (r(cVar) && h() == cVar.h()) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.f72728d;
    }

    public final int hashCode() {
        return jg.r.b(m(), Long.valueOf(p()), Boolean.valueOf(h()));
    }

    public String m() {
        return this.f72725a;
    }

    public long p() {
        long j15 = this.f72727c;
        return j15 == -1 ? this.f72726b : j15;
    }

    public boolean r(c cVar) {
        return cVar != null && jg.r.a(m(), cVar.m()) && p() == cVar.p();
    }

    public final String toString() {
        jg.r.a aVarC = jg.r.c(this);
        aVarC.a("name", m());
        aVarC.a("version", Long.valueOf(p()));
        aVarC.a("is_fully_rolled_out", Boolean.valueOf(h()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, m(), false);
        kg.c.m(parcel, 2, this.f72726b);
        kg.c.r(parcel, 3, p());
        kg.c.c(parcel, 4, h());
        kg.c.b(parcel, iA);
    }

    public c(String str, long j15) {
        this(str, -1, j15, false);
    }

    public c(String str, long j15, boolean z15) {
        this(str, -1, j15, z15);
    }
}
