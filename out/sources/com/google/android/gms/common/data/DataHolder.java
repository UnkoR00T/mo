package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import io.sentry.android.core.c2;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import kg.c;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public final class DataHolder extends kg.a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f29036l = new com.google.android.gms.common.data.a(new String[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f29037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f29038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Bundle f29039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CursorWindow[] f29040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f29042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int[] f29043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f29044h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f29045j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29046k = true;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f29047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f29048b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashMap f29049c = new HashMap();
    }

    DataHolder(int i15, String[] strArr, CursorWindow[] cursorWindowArr, int i16, Bundle bundle) {
        this.f29037a = i15;
        this.f29038b = strArr;
        this.f29040d = cursorWindowArr;
        this.f29041e = i16;
        this.f29042f = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f29045j) {
                    this.f29045j = true;
                    int i15 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f29040d;
                        if (i15 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i15].close();
                        i15++;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f29046k && this.f29040d.length > 0 && !isClosed()) {
                close();
                String string = toString();
                StringBuilder sb5 = new StringBuilder(String.valueOf(string).length() + 178);
                sb5.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb5.append(string);
                sb5.append(")");
                c2.e("DataBuffer", sb5.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public Bundle h() {
        return this.f29042f;
    }

    public boolean isClosed() {
        boolean z15;
        synchronized (this) {
            z15 = this.f29045j;
        }
        return z15;
    }

    public int m() {
        return this.f29041e;
    }

    public final void p() {
        this.f29039c = new Bundle();
        int i15 = 0;
        while (true) {
            String[] strArr = this.f29038b;
            if (i15 >= strArr.length) {
                break;
            }
            this.f29039c.putInt(strArr[i15], i15);
            i15++;
        }
        CursorWindow[] cursorWindowArr = this.f29040d;
        this.f29043g = new int[cursorWindowArr.length];
        int numRows = 0;
        for (int i16 = 0; i16 < cursorWindowArr.length; i16++) {
            this.f29043g[i16] = numRows;
            numRows += cursorWindowArr[i16].getNumRows() - (numRows - cursorWindowArr[i16].getStartPosition());
        }
        this.f29044h = numRows;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String[] strArr = this.f29038b;
        int iA = c.a(parcel);
        c.v(parcel, 1, strArr, false);
        c.x(parcel, 2, this.f29040d, i15, false);
        c.m(parcel, 3, m());
        c.d(parcel, 4, h(), false);
        c.m(parcel, 1000, this.f29037a);
        c.b(parcel, iA);
        if ((i15 & 1) != 0) {
            close();
        }
    }
}
