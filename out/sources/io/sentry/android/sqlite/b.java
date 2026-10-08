package io.sentry.android.sqlite;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import fr.w;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ \u0010\u0015\u001a\n \u000f*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u00020\f2\u000e\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u00050\u0005H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\f2\u000e\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u00050\u0005H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001aJ \u0010\u001c\u001a\n \u000f*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001f\u001a(\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00050\u0005 \u000f*\u0014\u0012\u000e\b\u0001\u0012\n \u000f*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u001e0\u001eH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\n \u000f*\u0004\u0018\u00010$0$H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020'2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0018\u0010-\u001a\u00020,2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\n \u000f*\u0004\u0018\u00010/0/H\u0096\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b2\u0010\u0018J\u0018\u00104\u001a\u0002032\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b4\u00105J \u00106\u001a\n \u000f*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b6\u0010\u001dJ\u0018\u00107\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b7\u0010+J\u0010\u00109\u001a\u000208H\u0096\u0001¢\u0006\u0004\b9\u0010:J\u0018\u0010<\u001a\n \u000f*\u0004\u0018\u00010;0;H\u0096\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u000208H\u0096\u0001¢\u0006\u0004\b>\u0010:J\u0010\u0010?\u001a\u000208H\u0096\u0001¢\u0006\u0004\b?\u0010:J\u0010\u0010@\u001a\u000208H\u0096\u0001¢\u0006\u0004\b@\u0010:J\u0010\u0010A\u001a\u000208H\u0096\u0001¢\u0006\u0004\bA\u0010:J\u0010\u0010B\u001a\u000208H\u0096\u0001¢\u0006\u0004\bB\u0010:J\u0018\u0010C\u001a\u0002082\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\bC\u0010DJ\u0018\u0010E\u001a\u0002082\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\bE\u0010DJ\u0010\u0010F\u001a\u000208H\u0096\u0001¢\u0006\u0004\bF\u0010:J\u0010\u0010G\u001a\u000208H\u0096\u0001¢\u0006\u0004\bG\u0010:J\u0010\u0010H\u001a\u000208H\u0096\u0001¢\u0006\u0004\bH\u0010:J\u0018\u0010I\u001a\u0002082\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\bI\u0010DJ\u0010\u0010J\u001a\u000208H\u0096\u0001¢\u0006\u0004\bJ\u0010:J \u0010L\u001a\u00020\t2\u000e\u0010\r\u001a\n \u000f*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bL\u0010MJ \u0010O\u001a\u00020\t2\u000e\u0010\r\u001a\n \u000f*\u0004\u0018\u00010N0NH\u0096\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u000208H\u0097\u0001¢\u0006\u0004\bQ\u0010:J(\u0010R\u001a\n \u000f*\u0004\u0018\u00010$0$2\u000e\u0010\r\u001a\n \u000f*\u0004\u0018\u00010$0$H\u0096\u0001¢\u0006\u0004\bR\u0010SJ \u0010T\u001a\u00020\t2\u000e\u0010\r\u001a\n \u000f*\u0004\u0018\u00010$0$H\u0096\u0001¢\u0006\u0004\bT\u0010UJ0\u0010W\u001a\u00020\t2\u000e\u0010\r\u001a\n \u000f*\u0004\u0018\u00010V0V2\u000e\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010/0/H\u0096\u0001¢\u0006\u0004\bW\u0010XJ \u0010Y\u001a\u00020\t2\u000e\u0010\r\u001a\n \u000f*\u0004\u0018\u00010K0KH\u0096\u0001¢\u0006\u0004\bY\u0010MJ \u0010Z\u001a\u00020\t2\u000e\u0010\r\u001a\n \u000f*\u0004\u0018\u00010N0NH\u0096\u0001¢\u0006\u0004\bZ\u0010PJ\u000f\u0010[\u001a\u00020\fH\u0016¢\u0006\u0004\b[\u0010\u0018J\u001f\u0010^\u001a\u0002082\u0006\u0010\\\u001a\u00020\f2\u0006\u0010]\u001a\u00020\fH\u0016¢\u0006\u0004\b^\u0010_J!\u0010b\u001a\u00020\t2\u0006\u0010`\u001a\u00020\f2\b\u0010a\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\bb\u0010cR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010l\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006m"}, d2 = {"Lio/sentry/android/sqlite/b;", "Landroid/database/CrossProcessCursor;", "delegate", "Lio/sentry/android/sqlite/a;", "spanManager", "", "sql", "<init>", "(Landroid/database/CrossProcessCursor;Lio/sentry/android/sqlite/a;Ljava/lang/String;)V", "Loq/i0;", "close", "()V", "", "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "deactivate", "", "getBlob", "(I)[B", "getColumnCount", "()I", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "", "getDouble", "(I)D", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "", "getFloat", "(I)F", "getInt", "(I)I", "", "getLong", "(I)J", "Landroid/net/Uri;", "getNotificationUri", "()Landroid/net/Uri;", "getPosition", "", "getShort", "(I)S", "getString", "getType", "", "getWantsAllOnMoveCalls", "()Z", "Landroid/database/CursorWindow;", "getWindow", "()Landroid/database/CursorWindow;", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "(I)Z", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "requery", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "Landroid/content/ContentResolver;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "unregisterContentObserver", "unregisterDataSetObserver", "getCount", "oldPosition", "newPosition", "onMove", "(II)Z", "position", "window", "fillWindow", "(ILandroid/database/CursorWindow;)V", "a", "Landroid/database/CrossProcessCursor;", "b", "Lio/sentry/android/sqlite/a;", "c", "Ljava/lang/String;", "d", "Z", "isSpanStarted", "sentry-android-sqlite_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements CrossProcessCursor {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CrossProcessCursor delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.sqlite.a spanManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sql;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isSpanStarted;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends w implements er.a<i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f94635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CursorWindow f94636d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i15, CursorWindow cursorWindow) {
            super(0);
            this.f94635c = i15;
            this.f94636d = cursorWindow;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            b.this.delegate.fillWindow(this.f94635c, this.f94636d);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.sqlite.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class C2229b extends w implements er.a<Integer> {
        C2229b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer a() {
            return Integer.valueOf(b.this.delegate.getCount());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class c extends w implements er.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f94639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f94640d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i15, int i16) {
            super(0);
            this.f94639c = i15;
            this.f94640d = i16;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.valueOf(b.this.delegate.onMove(this.f94639c, this.f94640d));
        }
    }

    public b(CrossProcessCursor crossProcessCursor, io.sentry.android.sqlite.a aVar, String str) {
        this.delegate = crossProcessCursor;
        this.spanManager = aVar;
        this.sql = str;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int p15, CharArrayBuffer p16) {
        this.delegate.copyStringToBuffer(p15, p16);
    }

    @Override // android.database.Cursor
    @oq.a
    public void deactivate() {
        this.delegate.deactivate();
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int position, CursorWindow window) {
        if (this.isSpanStarted) {
            this.delegate.fillWindow(position, window);
        } else {
            this.isSpanStarted = true;
            this.spanManager.a(this.sql, new a(position, window));
        }
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int p15) {
        return this.delegate.getBlob(p15);
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return this.delegate.getColumnCount();
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String p15) {
        return this.delegate.getColumnIndex(p15);
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String p15) {
        return this.delegate.getColumnIndexOrThrow(p15);
    }

    @Override // android.database.Cursor
    public String getColumnName(int p15) {
        return this.delegate.getColumnName(p15);
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.delegate.getColumnNames();
    }

    @Override // android.database.Cursor
    public int getCount() {
        if (this.isSpanStarted) {
            return this.delegate.getCount();
        }
        this.isSpanStarted = true;
        return ((Number) this.spanManager.a(this.sql, new C2229b())).intValue();
    }

    @Override // android.database.Cursor
    public double getDouble(int p15) {
        return this.delegate.getDouble(p15);
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return this.delegate.getExtras();
    }

    @Override // android.database.Cursor
    public float getFloat(int p15) {
        return this.delegate.getFloat(p15);
    }

    @Override // android.database.Cursor
    public int getInt(int p15) {
        return this.delegate.getInt(p15);
    }

    @Override // android.database.Cursor
    public long getLong(int p15) {
        return this.delegate.getLong(p15);
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return this.delegate.getNotificationUri();
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.delegate.getPosition();
    }

    @Override // android.database.Cursor
    public short getShort(int p15) {
        return this.delegate.getShort(p15);
    }

    @Override // android.database.Cursor
    public String getString(int p15) {
        return this.delegate.getString(p15);
    }

    @Override // android.database.Cursor
    public int getType(int p15) {
        return this.delegate.getType(p15);
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return this.delegate.getWantsAllOnMoveCalls();
    }

    @Override // android.database.CrossProcessCursor
    public CursorWindow getWindow() {
        return this.delegate.getWindow();
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return this.delegate.isAfterLast();
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return this.delegate.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return this.delegate.isClosed();
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.delegate.isFirst();
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.delegate.isLast();
    }

    @Override // android.database.Cursor
    public boolean isNull(int p15) {
        return this.delegate.isNull(p15);
    }

    @Override // android.database.Cursor
    public boolean move(int p15) {
        return this.delegate.move(p15);
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        return this.delegate.moveToFirst();
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        return this.delegate.moveToLast();
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        return this.delegate.moveToNext();
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int p15) {
        return this.delegate.moveToPosition(p15);
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        return this.delegate.moveToPrevious();
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int oldPosition, int newPosition) {
        if (this.isSpanStarted) {
            return this.delegate.onMove(oldPosition, newPosition);
        }
        this.isSpanStarted = true;
        return ((Boolean) this.spanManager.a(this.sql, new c(oldPosition, newPosition))).booleanValue();
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver p15) {
        this.delegate.registerContentObserver(p15);
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver p15) {
        this.delegate.registerDataSetObserver(p15);
    }

    @Override // android.database.Cursor
    @oq.a
    public boolean requery() {
        return this.delegate.requery();
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle p15) {
        return this.delegate.respond(p15);
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle p15) {
        this.delegate.setExtras(p15);
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver p15, Uri p16) {
        this.delegate.setNotificationUri(p15, p16);
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver p15) {
        this.delegate.unregisterContentObserver(p15);
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver p15) {
        this.delegate.unregisterDataSetObserver(p15);
    }
}
