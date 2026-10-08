package net.zetetic.database;

import java.text.Collator;
import java.util.Locale;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteStatement;

/* JADX INFO: loaded from: classes3.dex */
public class DatabaseUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f135359a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Collator f135360b = null;

    @Deprecated
    public static class InsertHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SQLiteDatabase f135361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f135362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f135363c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private SQLiteStatement f135364d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private SQLiteStatement f135365e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SQLiteStatement f135366f = null;

        public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
            this.f135361a = sQLiteDatabase;
            this.f135362b = str;
        }
    }

    public static int a(int i15, int i16) {
        return Math.max(i15 - (i16 / 3), 0);
    }

    public static int b(String str) {
        String strTrim = str.trim();
        if (strTrim.length() < 3) {
            return 99;
        }
        String upperCase = strTrim.substring(0, 3).toUpperCase(Locale.ROOT);
        if (upperCase.equals("SEL")) {
            return 1;
        }
        if (upperCase.equals("INS") || upperCase.equals("UPD") || upperCase.equals("REP") || upperCase.equals("DEL")) {
            return 2;
        }
        if (upperCase.equals("ATT")) {
            return 3;
        }
        if (upperCase.equals("COM") || upperCase.equals("END")) {
            return 5;
        }
        if (upperCase.equals("ROL")) {
            return 6;
        }
        if (upperCase.equals("BEG")) {
            return 4;
        }
        if (upperCase.equals("PRA")) {
            return 7;
        }
        if (upperCase.equals("CRE") || upperCase.equals("DRO") || upperCase.equals("ALT")) {
            return 8;
        }
        return (upperCase.equals("ANA") || upperCase.equals("DET")) ? 9 : 99;
    }

    public static int c(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        return ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) ? 1 : 3;
    }

    public static long d(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement sQLiteStatementB2 = sQLiteDatabase.B2(str);
        try {
            return e(sQLiteStatementB2, strArr);
        } finally {
            sQLiteStatementB2.close();
        }
    }

    public static long e(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.r(strArr);
        return sQLiteStatement.J();
    }
}
