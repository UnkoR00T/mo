package net.zetetic.database;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractCursor implements Cursor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f135343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ContentResolver f135344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f135345d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ContentObserver f135347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f135348g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f135346e = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final DataSetObservable f135349h = new DataSetObservable();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ContentObservable f135350j = new ContentObservable();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bundle f135351k = Bundle.EMPTY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f135342a = -1;

    protected static class SelfContentObserver extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<AbstractCursor> f135352a;

        public SelfContentObserver(AbstractCursor abstractCursor) {
            super(null);
            this.f135352a = new WeakReference<>(abstractCursor);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z15) {
            AbstractCursor abstractCursor = this.f135352a.get();
            if (abstractCursor != null) {
                abstractCursor.h(false);
            }
        }
    }

    protected void b() {
        if (-1 == this.f135342a || getCount() == this.f135342a) {
            throw new CursorIndexOutOfBoundsException(this.f135342a, getCount());
        }
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f135343b = true;
        this.f135350j.unregisterAll();
        m();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i15, CharArrayBuffer charArrayBuffer) {
        String string = getString(i15);
        if (string == null) {
            charArrayBuffer.sizeCopied = 0;
            return;
        }
        char[] cArr = charArrayBuffer.data;
        if (cArr == null || cArr.length < string.length()) {
            charArrayBuffer.data = string.toCharArray();
        } else {
            string.getChars(0, string.length(), cArr, 0);
        }
        charArrayBuffer.sizeCopied = string.length();
    }

    @Override // android.database.Cursor
    public void deactivate() {
        m();
    }

    protected void finalize() {
        ContentObserver contentObserver = this.f135347f;
        if (contentObserver != null && this.f135348g) {
            this.f135344c.unregisterContentObserver(contentObserver);
        }
        try {
            if (this.f135343b) {
                return;
            }
            close();
        } catch (Exception unused) {
        }
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i15) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Logger.c("Cursor", "requesting column name with table name -- " + str, new Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (columnNames[i15].equalsIgnoreCase(str)) {
                return i15;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist");
    }

    @Override // android.database.Cursor
    public String getColumnName(int i15) {
        return getColumnNames()[i15];
    }

    @Override // android.database.Cursor
    public abstract String[] getColumnNames();

    @Override // android.database.Cursor
    public abstract int getCount();

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return this.f135351k;
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        Uri uri;
        synchronized (this.f135346e) {
            uri = this.f135345d;
        }
        return uri;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.f135342a;
    }

    @Override // android.database.Cursor
    public abstract String getString(int i15);

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    protected void h(boolean z15) {
        synchronized (this.f135346e) {
            try {
                this.f135350j.dispatchChange(z15, null);
                Uri uri = this.f135345d;
                if (uri != null && z15) {
                    this.f135344c.notifyChange(uri, this.f135347f);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return getCount() == 0 || this.f135342a == getCount();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return getCount() == 0 || this.f135342a == -1;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return this.f135343b;
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.f135342a == 0 && getCount() != 0;
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        int count = getCount();
        return this.f135342a == count + (-1) && count != 0;
    }

    protected void m() {
        ContentObserver contentObserver = this.f135347f;
        if (contentObserver != null) {
            this.f135344c.unregisterContentObserver(contentObserver);
            this.f135348g = false;
        }
        this.f135349h.notifyInvalidated();
    }

    @Override // android.database.Cursor
    public final boolean move(int i15) {
        return moveToPosition(this.f135342a + i15);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.f135342a + 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i15) {
        int count = getCount();
        if (i15 >= count) {
            this.f135342a = count;
            return false;
        }
        if (i15 < 0) {
            this.f135342a = -1;
            return false;
        }
        int i16 = this.f135342a;
        if (i15 == i16) {
            return true;
        }
        boolean zOnMove = onMove(i16, i15);
        if (zOnMove) {
            this.f135342a = i15;
            return zOnMove;
        }
        this.f135342a = -1;
        return zOnMove;
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.f135342a - 1);
    }

    public abstract boolean onMove(int i15, int i16);

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
        this.f135350j.registerObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f135349h.registerObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public boolean requery() {
        ContentObserver contentObserver = this.f135347f;
        if (contentObserver != null && !this.f135348g) {
            this.f135344c.registerContentObserver(this.f135345d, true, contentObserver);
            this.f135348g = true;
        }
        this.f135349h.notifyChanged();
        return true;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.f135351k = bundle;
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.f135346e) {
            try {
                this.f135345d = uri;
                this.f135344c = contentResolver;
                ContentObserver contentObserver = this.f135347f;
                if (contentObserver != null) {
                    contentResolver.unregisterContentObserver(contentObserver);
                }
                SelfContentObserver selfContentObserver = new SelfContentObserver(this);
                this.f135347f = selfContentObserver;
                this.f135344c.registerContentObserver(this.f135345d, true, selfContentObserver);
                this.f135348g = true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
        if (this.f135343b) {
            return;
        }
        this.f135350j.unregisterObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f135349h.unregisterObserver(dataSetObserver);
    }
}
