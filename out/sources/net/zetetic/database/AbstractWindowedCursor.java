package net.zetetic.database;

import android.database.CharArrayBuffer;
import android.database.StaleDataException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractWindowedCursor extends AbstractCursor {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected CursorWindow f135353l;

    @Override // net.zetetic.database.AbstractCursor
    protected void b() {
        super.b();
        if (this.f135353l == null) {
            throw new StaleDataException("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public void copyStringToBuffer(int i15, CharArrayBuffer charArrayBuffer) {
        this.f135353l.r(this.f135342a, i15, charArrayBuffer);
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public byte[] getBlob(int i15) {
        b();
        return this.f135353l.u(this.f135342a, i15);
    }

    @Override // android.database.Cursor
    public double getDouble(int i15) {
        b();
        return this.f135353l.y(this.f135342a, i15);
    }

    @Override // android.database.Cursor
    public float getFloat(int i15) {
        b();
        return this.f135353l.C(this.f135342a, i15);
    }

    @Override // android.database.Cursor
    public int getInt(int i15) {
        b();
        return this.f135353l.E(this.f135342a, i15);
    }

    @Override // android.database.Cursor
    public long getLong(int i15) {
        b();
        return this.f135353l.H(this.f135342a, i15);
    }

    @Override // android.database.Cursor
    public short getShort(int i15) {
        b();
        return this.f135353l.K(this.f135342a, i15);
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public String getString(int i15) {
        b();
        return this.f135353l.M(this.f135342a, i15);
    }

    @Override // android.database.Cursor
    public int getType(int i15) {
        return this.f135353l.N(this.f135342a, i15);
    }

    @Override // android.database.Cursor
    public boolean isNull(int i15) {
        return this.f135353l.N(this.f135342a, i15) == 0;
    }

    @Override // net.zetetic.database.AbstractCursor
    protected void m() {
        super.m();
        p();
    }

    protected void p() {
        CursorWindow cursorWindow = this.f135353l;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.f135353l = null;
        }
    }

    public CursorWindow r() {
        return this.f135353l;
    }

    public void u(CursorWindow cursorWindow) {
        if (cursorWindow != this.f135353l) {
            p();
            this.f135353l = cursorWindow;
        }
    }
}
