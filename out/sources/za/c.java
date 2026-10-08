package za;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Pair;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.io.Closeable;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u001e\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\"J)\u0010$\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001cH&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH&¢\u0006\u0004\b&\u0010\u0010J\u000f\u0010'\u001a\u00020\u0007H&¢\u0006\u0004\b'\u0010\tR\u0014\u0010(\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0016\u0010+\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0010R(\u00102\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020/\u0018\u00010.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00063À\u0006\u0001"}, d2 = {"Lza/c;", "Ljava/io/Closeable;", "", "sql", "Lza/g;", "B2", "(Ljava/lang/String;)Lza/g;", "Loq/i0;", "q0", "()V", "b1", i.f37089p, "r1", "X0", "", "l0", "()Z", "Lza/f;", "query", "Landroid/database/Cursor;", "X1", "(Lza/f;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "Y2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "E0", "(Ljava/lang/String;)V", "bindArgs", "a1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "W0", "B0", "isOpen", "W", "()Ljava/lang/String;", "path", "P3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "x0", "()Ljava/util/List;", "attachedDbs", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c extends Closeable {
    void B0();

    g B2(String sql);

    void E0(String sql);

    default void H2() {
        q0();
    }

    boolean P3();

    String W();

    boolean W0();

    void X0();

    Cursor X1(f query);

    int Y2(String table, int conflictAlgorithm, ContentValues values, String whereClause, Object[] whereArgs);

    void a1(String sql, Object[] bindArgs);

    void b1();

    boolean isOpen();

    boolean l0();

    void q0();

    void r1();

    List<Pair<String, String>> x0();
}
