package net.zetetic.database.sqlcipher;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import java.util.Arrays;
import za.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SQLiteProgram extends SQLiteClosable implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f135502h = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteDatabase f135503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f135504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f135505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f135506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f135507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object[] f135508g;

    SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        this.f135503b = sQLiteDatabase;
        String strTrim = str.trim();
        this.f135504c = strTrim;
        int sqlStatementType = DatabaseUtils.getSqlStatementType(strTrim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.f135505d = false;
            this.f135506e = f135502h;
            this.f135507f = 0;
        } else {
            boolean z15 = sqlStatementType == 1;
            SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
            sQLiteDatabase.K().m(strTrim, sQLiteDatabase.J(z15), cancellationSignal, sQLiteStatementInfo);
            this.f135505d = sQLiteStatementInfo.f135529c;
            this.f135506e = sQLiteStatementInfo.f135528b;
            this.f135507f = sQLiteStatementInfo.f135527a;
        }
        if (objArr != null && objArr.length > this.f135507f) {
            throw new IllegalArgumentException("Too many bind arguments.  " + objArr.length + " arguments were provided but the statement needs " + this.f135507f + " arguments.");
        }
        int i15 = this.f135507f;
        if (i15 == 0) {
            this.f135508g = null;
            return;
        }
        Object[] objArr2 = new Object[i15];
        this.f135508g = objArr2;
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    private void p(int i15, Object obj) {
        if (i15 >= 1 && i15 <= this.f135507f) {
            this.f135508g[i15 - 1] = obj;
            return;
        }
        throw new IllegalArgumentException("Cannot bind argument at index " + i15 + " because the index is out of range.  The statement has " + this.f135507f + " parameters.");
    }

    final SQLiteDatabase C() {
        return this.f135503b;
    }

    protected final SQLiteSession E() {
        return this.f135503b.K();
    }

    String H() {
        return this.f135504c;
    }

    protected final void I(SQLiteException sQLiteException) {
        this.f135503b.Z(sQLiteException);
    }

    @Override // za.e
    public void Q(int i15, double d15) {
        p(i15, Double.valueOf(d15));
    }

    @Override // za.e
    public void f0(int i15, long j15) {
        p(i15, Long.valueOf(j15));
    }

    @Override // za.e
    public void g0(int i15, byte[] bArr) {
        if (bArr != null) {
            p(i15, bArr);
            return;
        }
        throw new IllegalArgumentException("the bind value at index " + i15 + " is null");
    }

    final String[] getColumnNames() {
        return this.f135506e;
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    protected void h() {
        o0();
    }

    @Override // za.e
    public void i0(int i15) {
        p(i15, null);
    }

    @Override // za.e
    public void o0() {
        Object[] objArr = this.f135508g;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public void r(String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                s2(length, strArr[length - 1]);
            }
        }
    }

    @Override // za.e
    public void s2(int i15, String str) {
        if (str != null) {
            p(i15, str);
            return;
        }
        throw new IllegalArgumentException("the bind value at index " + i15 + " is null");
    }

    final Object[] u() {
        return this.f135508g;
    }

    protected final int y() {
        return this.f135503b.J(this.f135505d);
    }
}
