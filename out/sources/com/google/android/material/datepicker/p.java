package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes4.dex */
final class p implements Comparable<p>, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f35187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f35188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f35189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f35190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f35191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f35192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35193g;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return p.e(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i15) {
            return new p[i15];
        }
    }

    private p(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = w.c(calendar);
        this.f35187a = calendarC;
        this.f35188b = calendarC.get(2);
        this.f35189c = calendarC.get(1);
        this.f35190d = calendarC.getMaximum(7);
        this.f35191e = calendarC.getActualMaximum(5);
        this.f35192f = calendarC.getTimeInMillis();
    }

    static p e(int i15, int i16) {
        Calendar calendarI = w.i();
        calendarI.set(1, i15);
        calendarI.set(2, i16);
        return new p(calendarI);
    }

    static p g(long j15) {
        Calendar calendarI = w.i();
        calendarI.setTimeInMillis(j15);
        return new p(calendarI);
    }

    static p j() {
        return new p(w.g());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(p pVar) {
        return this.f35187a.compareTo(pVar.f35187a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f35188b == pVar.f35188b && this.f35189c == pVar.f35189c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f35188b), Integer.valueOf(this.f35189c)});
    }

    int k(int i15) {
        int i16 = this.f35187a.get(7);
        if (i15 <= 0) {
            i15 = this.f35187a.getFirstDayOfWeek();
        }
        int i17 = i16 - i15;
        return i17 < 0 ? i17 + this.f35190d : i17;
    }

    long l(int i15) {
        Calendar calendarC = w.c(this.f35187a);
        calendarC.set(5, i15);
        return calendarC.getTimeInMillis();
    }

    int n(long j15) {
        Calendar calendarC = w.c(this.f35187a);
        calendarC.setTimeInMillis(j15);
        return calendarC.get(5);
    }

    String o() {
        if (this.f35193g == null) {
            this.f35193g = e.f(this.f35187a.getTimeInMillis());
        }
        return this.f35193g;
    }

    long p() {
        return this.f35187a.getTimeInMillis();
    }

    p q(int i15) {
        Calendar calendarC = w.c(this.f35187a);
        calendarC.add(2, i15);
        return new p(calendarC);
    }

    int r(p pVar) {
        if (this.f35187a instanceof GregorianCalendar) {
            return ((pVar.f35189c - this.f35189c) * 12) + (pVar.f35188b - this.f35188b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(this.f35189c);
        parcel.writeInt(this.f35188b);
    }
}
