package net.zetetic.database;

import android.database.CursorIndexOutOfBoundsException;

/* JADX INFO: loaded from: classes3.dex */
public class MatrixCursor extends AbstractCursor {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String[] f135368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Object[] f135369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f135370n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f135371p;

    public class RowBuilder {
    }

    public MatrixCursor(String[] strArr, int i15) {
        this.f135370n = 0;
        this.f135368l = strArr;
        int length = strArr.length;
        this.f135371p = length;
        this.f135369m = new Object[length * (i15 < 1 ? 1 : i15)];
    }

    private Object p(int i15) {
        int i16;
        if (i15 < 0 || i15 >= (i16 = this.f135371p)) {
            throw new CursorIndexOutOfBoundsException("Requested column: " + i15 + ", # of columns: " + this.f135371p);
        }
        int i17 = this.f135342a;
        if (i17 < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        }
        if (i17 < this.f135370n) {
            return this.f135369m[(i17 * i16) + i15];
        }
        throw new CursorIndexOutOfBoundsException("After last row.");
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.f135368l;
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        return this.f135370n;
    }

    @Override // android.database.Cursor
    public double getDouble(int i15) {
        Object objP = p(i15);
        if (objP == null) {
            return 0.0d;
        }
        return objP instanceof Number ? ((Number) objP).doubleValue() : Double.parseDouble(objP.toString());
    }

    @Override // android.database.Cursor
    public float getFloat(int i15) {
        Object objP = p(i15);
        if (objP == null) {
            return 0.0f;
        }
        return objP instanceof Number ? ((Number) objP).floatValue() : Float.parseFloat(objP.toString());
    }

    @Override // android.database.Cursor
    public int getInt(int i15) {
        Object objP = p(i15);
        if (objP == null) {
            return 0;
        }
        return objP instanceof Number ? ((Number) objP).intValue() : Integer.parseInt(objP.toString());
    }

    @Override // android.database.Cursor
    public long getLong(int i15) {
        Object objP = p(i15);
        if (objP == null) {
            return 0L;
        }
        return objP instanceof Number ? ((Number) objP).longValue() : Long.parseLong(objP.toString());
    }

    @Override // android.database.Cursor
    public short getShort(int i15) {
        Object objP = p(i15);
        if (objP == null) {
            return (short) 0;
        }
        return objP instanceof Number ? ((Number) objP).shortValue() : Short.parseShort(objP.toString());
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public String getString(int i15) {
        Object objP = p(i15);
        if (objP == null) {
            return null;
        }
        return objP.toString();
    }

    @Override // android.database.Cursor
    public int getType(int i15) {
        return DatabaseUtils.c(p(i15));
    }

    @Override // android.database.Cursor
    public boolean isNull(int i15) {
        return p(i15) == null;
    }

    @Override // net.zetetic.database.AbstractCursor
    public boolean onMove(int i15, int i16) {
        return true;
    }

    public MatrixCursor(String[] strArr) {
        this(strArr, 16);
    }
}
