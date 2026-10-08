package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0747a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f35098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f35099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f35100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f35101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f35103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f35104g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0747a implements Parcelable.Creator<a> {
        C0747a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((p) parcel.readParcelable(p.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i15) {
            return new a[i15];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f35105f = w.a(p.e(1900, 0).f35192f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f35106g = w.a(p.e(2100, 11).f35192f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f35107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f35108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f35109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f35110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f35111e;

        b(a aVar) {
            this.f35107a = f35105f;
            this.f35108b = f35106g;
            this.f35111e = f.a(Long.MIN_VALUE);
            this.f35107a = aVar.f35098a.f35192f;
            this.f35108b = aVar.f35099b.f35192f;
            this.f35109c = Long.valueOf(aVar.f35101d.f35192f);
            this.f35110d = aVar.f35102e;
            this.f35111e = aVar.f35100c;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f35111e);
            p pVarG = p.g(this.f35107a);
            p pVarG2 = p.g(this.f35108b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l15 = this.f35109c;
            return new a(pVarG, pVarG2, cVar, l15 == null ? null : p.g(l15.longValue()), this.f35110d, null);
        }

        public b b(long j15) {
            this.f35109c = Long.valueOf(j15);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean F1(long j15);
    }

    /* synthetic */ a(p pVar, p pVar2, c cVar, p pVar3, int i15, C0747a c0747a) {
        this(pVar, pVar2, cVar, pVar3, i15);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f35098a.equals(aVar.f35098a) && this.f35099b.equals(aVar.f35099b) && i6.c.a(this.f35101d, aVar.f35101d) && this.f35102e == aVar.f35102e && this.f35100c.equals(aVar.f35100c);
    }

    p f(p pVar) {
        if (pVar.compareTo(this.f35098a) < 0) {
            return this.f35098a;
        }
        return pVar.compareTo(this.f35099b) > 0 ? this.f35099b : pVar;
    }

    public c g() {
        return this.f35100c;
    }

    p h() {
        return this.f35099b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35098a, this.f35099b, this.f35101d, Integer.valueOf(this.f35102e), this.f35100c});
    }

    int i() {
        return this.f35102e;
    }

    int j() {
        return this.f35104g;
    }

    p k() {
        return this.f35101d;
    }

    p l() {
        return this.f35098a;
    }

    int m() {
        return this.f35103f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(this.f35098a, 0);
        parcel.writeParcelable(this.f35099b, 0);
        parcel.writeParcelable(this.f35101d, 0);
        parcel.writeParcelable(this.f35100c, 0);
        parcel.writeInt(this.f35102e);
    }

    private a(p pVar, p pVar2, c cVar, p pVar3, int i15) {
        Objects.requireNonNull(pVar, "start cannot be null");
        Objects.requireNonNull(pVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f35098a = pVar;
        this.f35099b = pVar2;
        this.f35101d = pVar3;
        this.f35102e = i15;
        this.f35100c = cVar;
        if (pVar3 != null && pVar.compareTo(pVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (pVar3 != null && pVar3.compareTo(pVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i15 < 0 || i15 > w.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f35104g = pVar.r(pVar2) + 1;
        this.f35103f = (pVar2.f35189c - pVar.f35189c) + 1;
    }
}
