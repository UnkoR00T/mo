package bb;

import android.database.Cursor;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.k;
import fr.t;
import fu.r;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import oq.p;
import p071kotlin.Metadata;
import za.f;
import za.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00192\u00020\u0001:\u0005\u000b\u001a\r\u0019\u0013B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0001\u0004\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lbb/c;", "Lya/d;", "Lza/c;", "db", "", "sql", "<init>", "(Lza/c;Ljava/lang/String;)V", "Loq/i0;", "p", "()V", "a", "Lza/c;", "b", "()Lza/c;", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "", "c", "Z", "isClosed", "()Z", "m", "(Z)V", "d", "e", "Lbb/c$b;", "Lbb/c$c;", "Lbb/c$d;", "Lbb/c$e;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c implements ya.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final za.c db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sql;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: bb.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u000b\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lbb/c$a;", "", "<init>", "()V", "", "prefix", "sql", "Lbb/c$a$b;", "e", "(Ljava/lang/String;Ljava/lang/String;)Lbb/c$a$b;", "Lbb/c$a$a;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lbb/c$a$a;", "", "f", "(Ljava/lang/String;)Z", "s", "", "d", "(Ljava/lang/String;)I", "Lza/c;", "db", "Lbb/c;", "a", "(Lza/c;Ljava/lang/String;)Lbb/c;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: bb.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lbb/c$a$a;", "", "<init>", "()V", "a", "Lbb/c$a$a$a;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static abstract class AbstractC0441a {

            /* JADX INFO: renamed from: bb.c$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbb/c$a$a$a;", "Lbb/c$a$a;", "<init>", "()V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C0442a extends AbstractC0441a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0442a f17976a = new C0442a();

                private C0442a() {
                    super(null);
                }
            }

            public /* synthetic */ AbstractC0441a(k kVar) {
                this();
            }

            private AbstractC0441a() {
            }
        }

        /* JADX INFO: renamed from: bb.c$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lbb/c$a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private enum b {
            END,
            ROLLBACK,
            BEGIN_EXCLUSIVE,
            BEGIN_IMMEDIATE,
            BEGIN_DEFERRED;


            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ wq.a f17983g = wq.b.a(b());
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final AbstractC0441a b(String prefix, String sql) {
            if (t.c(prefix, "PRA") && r.d0(r.e1(sql.toLowerCase(Locale.ROOT), "journal_mode", ""), "=", false, 2, null)) {
                return AbstractC0441a.C0442a.f17976a;
            }
            return null;
        }

        private final int d(String s15) {
            String str;
            int i15;
            int length = s15.length() - 2;
            if (length < 0) {
                return -1;
            }
            int i16 = 0;
            while (i16 < length) {
                char cCharAt = s15.charAt(i16);
                if (t.d(cCharAt, 32) <= 0) {
                    i16++;
                } else {
                    if (cCharAt != '-') {
                        str = s15;
                        if (cCharAt == '/') {
                            int iQ0 = i16 + 1;
                            if (str.charAt(iQ0) == '*') {
                                do {
                                    String str2 = str;
                                    iQ0 = r.q0(str2, '*', iQ0 + 1, false, 4, null);
                                    str = str2;
                                    if (iQ0 >= 0) {
                                        i15 = iQ0 + 1;
                                        if (i15 >= length) {
                                            break;
                                        }
                                    } else {
                                        return -1;
                                    }
                                } while (str.charAt(i15) != '/');
                                i16 = iQ0 + 2;
                                s15 = str;
                            }
                        }
                        return i16;
                    }
                    if (s15.charAt(i16 + 1) != '-') {
                        return i16;
                    }
                    str = s15;
                    int iQ1 = r.q0(str, '\n', i16 + 2, false, 4, null);
                    if (iQ1 < 0) {
                        return -1;
                    }
                    i16 = iQ1 + 1;
                    s15 = str;
                }
            }
            return -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            if (r5.equals("END") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        
            if (r5.equals("COM") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        
            return bb.c.Companion.b.f17977a;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final bb.c.Companion.b e(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                int r0 = r5.hashCode()
                r1 = 2
                r2 = 0
                r3 = 0
                switch(r0) {
                    case 65636: goto L35;
                    case 66913: goto L29;
                    case 68795: goto L20;
                    case 81327: goto Lb;
                    default: goto La;
                }
            La:
                goto L3d
            Lb:
                java.lang.String r0 = "ROL"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L14
                goto L3d
            L14:
                java.lang.String r5 = " TO "
                boolean r5 = fu.r.d0(r6, r5, r2, r1, r3)
                if (r5 == 0) goto L1d
                return r3
            L1d:
                bb.c$a$b r5 = bb.c.Companion.b.ROLLBACK
                return r5
            L20:
                java.lang.String r6 = "END"
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L32
                goto L3d
            L29:
                java.lang.String r6 = "COM"
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L32
                goto L3d
            L32:
                bb.c$a$b r5 = bb.c.Companion.b.END
                return r5
            L35:
                java.lang.String r0 = "BEG"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L3e
            L3d:
                return r3
            L3e:
                java.lang.String r5 = "EXCLUSIVE"
                boolean r5 = fu.r.d0(r6, r5, r2, r1, r3)
                if (r5 == 0) goto L49
                bb.c$a$b r5 = bb.c.Companion.b.BEGIN_EXCLUSIVE
                return r5
            L49:
                java.lang.String r5 = "IMMEDIATE"
                boolean r5 = fu.r.d0(r6, r5, r2, r1, r3)
                if (r5 == 0) goto L54
                bb.c$a$b r5 = bb.c.Companion.b.BEGIN_IMMEDIATE
                return r5
            L54:
                bb.c$a$b r5 = bb.c.Companion.b.BEGIN_DEFERRED
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: bb.c.Companion.e(java.lang.String, java.lang.String):bb.c$a$b");
        }

        private final boolean f(String prefix) {
            int iHashCode = prefix.hashCode();
            if (iHashCode == 79487) {
                return prefix.equals("PRA");
            }
            if (iHashCode != 81978) {
                return iHashCode == 85954 && prefix.equals("WIT");
            }
            return prefix.equals("SEL");
        }

        public final c a(za.c db5, String sql) {
            String upperCase = r.u1(sql).toString().toUpperCase(Locale.ROOT);
            String strC = c(upperCase);
            if (strC == null) {
                return new C0443c(db5, sql);
            }
            b bVarE = e(strC, upperCase);
            if (bVarE != null) {
                return new e(db5, sql, bVarE);
            }
            if (b(strC, upperCase) instanceof AbstractC0441a.C0442a) {
                return new b(db5, sql, new d(db5, sql));
            }
            return f(strC) ? new d(db5, sql) : new C0443c(db5, sql);
        }

        public final String c(String sql) {
            int iD = d(sql);
            if (iD < 0 || iD > sql.length()) {
                return null;
            }
            return sql.substring(iD, Math.min(iD + 3, sql.length()));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0018\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001a\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u00142\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00172\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b+\u0010'J\u0010\u0010,\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b/\u0010-R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lbb/c$b;", "Lbb/c;", "Lya/d;", "Lza/c;", "db", "", "sql", "delegate", "<init>", "(Lza/c;Ljava/lang/String;Lbb/c;)V", "", "Y3", "()Z", "", "index", "", "value", "Loq/i0;", "g0", "(I[B)V", "", "Q", "(ID)V", "", "f0", "(IJ)V", "S0", "(ILjava/lang/String;)V", "i0", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "M2", "(I)Z", "u3", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "reset", "()V", "o0", "close", "e", "Lbb/c;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b extends c implements ya.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final c delegate;

        public b(za.c cVar, String str, c cVar2) {
            super(cVar, str, null);
            this.delegate = cVar2;
        }

        @Override // ya.d
        public boolean M2(int index) {
            return this.delegate.M2(index);
        }

        @Override // ya.d
        public void Q(int index, double value) {
            this.delegate.Q(index, value);
        }

        @Override // ya.d
        public void S0(int index, String value) {
            this.delegate.S0(index, value);
        }

        @Override // ya.d
        public boolean Y3() {
            boolean zY3 = this.delegate.Y3();
            if (r.G(u3(0), "wal", true)) {
                getDb().W0();
                return zY3;
            }
            getDb().B0();
            return zY3;
        }

        @Override // ya.d, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // ya.d
        public void f0(int index, long value) {
            this.delegate.f0(index, value);
        }

        @Override // ya.d
        public void g0(int index, byte[] value) {
            this.delegate.g0(index, value);
        }

        @Override // ya.d
        public byte[] getBlob(int index) {
            return this.delegate.getBlob(index);
        }

        @Override // ya.d
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // ya.d
        public String getColumnName(int index) {
            return this.delegate.getColumnName(index);
        }

        @Override // ya.d
        public double getDouble(int index) {
            return this.delegate.getDouble(index);
        }

        @Override // ya.d
        public long getLong(int index) {
            return this.delegate.getLong(index);
        }

        @Override // ya.d
        public void i0(int index) {
            this.delegate.i0(index);
        }

        @Override // ya.d
        public boolean isNull(int index) {
            return this.delegate.isNull(index);
        }

        @Override // ya.d
        public void o0() {
            this.delegate.o0();
        }

        @Override // ya.d
        public void reset() {
            this.delegate.reset();
        }

        @Override // ya.d
        public String u3(int index) {
            return this.delegate.u3(index);
        }
    }

    /* JADX INFO: renamed from: bb.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010 J\u000f\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010*R\u0018\u00101\u001a\u00060-j\u0002`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lbb/c$c;", "Lbb/c;", "Lza/c;", "db", "", "sql", "<init>", "(Lza/c;Ljava/lang/String;)V", "", "index", "", "value", "Loq/i0;", "g0", "(I[B)V", "", "Q", "(ID)V", "", "f0", "(IJ)V", "S0", "(ILjava/lang/String;)V", "i0", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "u3", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "Y3", "()Z", "reset", "()V", "o0", "close", "Lza/g;", "Landroidx/sqlite/driver/SupportStatement;", "e", "Lza/g;", "delegate", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class C0443c extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final g delegate;

        public C0443c(za.c cVar, String str) {
            super(cVar, str, null);
            this.delegate = cVar.B2(str);
        }

        @Override // ya.d
        public void Q(int index, double value) {
            p();
            this.delegate.Q(index, value);
        }

        @Override // ya.d
        public void S0(int index, String value) {
            p();
            this.delegate.s2(index, value);
        }

        @Override // ya.d
        public boolean Y3() {
            p();
            this.delegate.B();
            return false;
        }

        @Override // ya.d, java.lang.AutoCloseable
        public void close() throws IOException {
            this.delegate.close();
            m(true);
        }

        @Override // ya.d
        public void f0(int index, long value) {
            p();
            this.delegate.f0(index, value);
        }

        @Override // ya.d
        public void g0(int index, byte[] value) {
            p();
            this.delegate.g0(index, value);
        }

        @Override // ya.d
        public byte[] getBlob(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }

        @Override // ya.d
        public int getColumnCount() {
            p();
            return 0;
        }

        @Override // ya.d
        public String getColumnName(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }

        @Override // ya.d
        public double getDouble(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }

        @Override // ya.d
        public long getLong(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }

        @Override // ya.d
        public void i0(int index) {
            p();
            this.delegate.i0(index);
        }

        @Override // ya.d
        public boolean isNull(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }

        @Override // ya.d
        public void o0() {
            p();
            this.delegate.o0();
        }

        @Override // ya.d
        public void reset() {
            p();
        }

        @Override // ya.d
        public String u3(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\b\u0002\u0018\u0000 M2\u00020\u0001:\u0001NB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010+J\u000f\u00102\u001a\u00020,H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010\u000fJ\u000f\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010\u000fJ\u000f\u00106\u001a\u00020\u000bH\u0016¢\u0006\u0004\b6\u0010\u000fR\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006O"}, d2 = {"Lbb/c$d;", "Lbb/c;", "Lza/c;", "db", "", "sql", "<init>", "(Lza/c;Ljava/lang/String;)V", "", "columnType", "index", "Loq/i0;", i.f37087n, "(II)V", "I", "()V", "Landroid/database/Cursor;", "K", "()Landroid/database/Cursor;", "c", "J", "(Landroid/database/Cursor;I)V", "", "value", "g0", "(I[B)V", "", "Q", "(ID)V", "", "f0", "(IJ)V", "S0", "(ILjava/lang/String;)V", "i0", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "u3", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "Y3", "()Z", "reset", "o0", "close", "", "e", "[I", "bindingTypes", "", "f", "[J", "longBindings", "", "g", "[D", "doubleBindings", "", "h", "[Ljava/lang/String;", "stringBindings", "j", "[[B", "blobBindings", "k", "Landroid/database/Cursor;", "cursor", "l", "a", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class d extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int[] bindingTypes;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long[] longBindings;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private double[] doubleBindings;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private String[] stringBindings;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private byte[][] blobBindings;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Cursor cursor;

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"bb/c$d$b", "Lza/f;", "Lza/e;", "statement", "Loq/i0;", "b", "(Lza/e;)V", "", "a", "()Ljava/lang/String;", "sql", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements f {
            b() {
            }

            @Override // za.f
            public String a() {
                return d.this.getSql();
            }

            @Override // za.f
            public void b(za.e statement) {
                int length = d.this.bindingTypes.length;
                for (int i15 = 1; i15 < length; i15++) {
                    int i16 = d.this.bindingTypes[i15];
                    if (i16 == 1) {
                        statement.f0(i15, d.this.longBindings[i15]);
                    } else if (i16 == 2) {
                        statement.Q(i15, d.this.doubleBindings[i15]);
                    } else if (i16 == 3) {
                        statement.s2(i15, d.this.stringBindings[i15]);
                    } else if (i16 == 4) {
                        statement.g0(i15, d.this.blobBindings[i15]);
                    } else if (i16 == 5) {
                        statement.i0(i15);
                    }
                }
            }
        }

        public d(za.c cVar, String str) {
            super(cVar, str, null);
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void H(int columnType, int index) {
            int i15 = index + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i15) {
                this.bindingTypes = Arrays.copyOf(iArr, i15);
            }
            if (columnType == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i15) {
                    this.longBindings = Arrays.copyOf(jArr, i15);
                    return;
                }
                return;
            }
            if (columnType == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i15) {
                    this.doubleBindings = Arrays.copyOf(dArr, i15);
                    return;
                }
                return;
            }
            if (columnType == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i15) {
                    this.stringBindings = (String[]) Arrays.copyOf(strArr, i15);
                    return;
                }
                return;
            }
            if (columnType != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i15) {
                this.blobBindings = (byte[][]) Arrays.copyOf(bArr, i15);
            }
        }

        private final void I() {
            if (this.cursor == null) {
                this.cursor = getDb().X1(new b());
            }
        }

        private final void J(Cursor c15, int index) {
            if (index < 0 || index >= c15.getColumnCount()) {
                ya.a.b(25, "column index out of range");
                throw new oq.g();
            }
        }

        private final Cursor K() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            ya.a.b(21, "no row");
            throw new oq.g();
        }

        @Override // ya.d
        public void Q(int index, double value) {
            p();
            H(2, index);
            this.bindingTypes[index] = 2;
            this.doubleBindings[index] = value;
        }

        @Override // ya.d
        public void S0(int index, String value) {
            p();
            H(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        @Override // ya.d
        public boolean Y3() {
            p();
            I();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // ya.d, java.lang.AutoCloseable
        public void close() {
            if (!getIsClosed()) {
                o0();
                reset();
            }
            m(true);
        }

        @Override // ya.d
        public void f0(int index, long value) {
            p();
            H(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }

        @Override // ya.d
        public void g0(int index, byte[] value) {
            p();
            H(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }

        @Override // ya.d
        public byte[] getBlob(int index) {
            p();
            Cursor cursorK = K();
            J(cursorK, index);
            return cursorK.getBlob(index);
        }

        @Override // ya.d
        public int getColumnCount() {
            p();
            I();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // ya.d
        public String getColumnName(int index) {
            p();
            I();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            J(cursor, index);
            return cursor.getColumnName(index);
        }

        @Override // ya.d
        public double getDouble(int index) {
            p();
            Cursor cursorK = K();
            J(cursorK, index);
            return cursorK.getDouble(index);
        }

        @Override // ya.d
        public long getLong(int index) {
            p();
            Cursor cursorK = K();
            J(cursorK, index);
            return cursorK.getLong(index);
        }

        @Override // ya.d
        public void i0(int index) {
            p();
            H(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // ya.d
        public boolean isNull(int index) {
            p();
            Cursor cursorK = K();
            J(cursorK, index);
            return cursorK.isNull(index);
        }

        @Override // ya.d
        public void o0() {
            p();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // ya.d
        public void reset() {
            p();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }

        @Override // ya.d
        public String u3(int index) {
            p();
            Cursor cursorK = K();
            J(cursorK, index);
            return cursorK.getString(index);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\"J\u000f\u0010)\u001a\u00020#H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lbb/c$e;", "Lbb/c;", "Lza/c;", "db", "", "sql", "Lbb/c$a$b;", "operation", "<init>", "(Lza/c;Ljava/lang/String;Lbb/c$a$b;)V", "", "index", "", "value", "Loq/i0;", "g0", "(I[B)V", "", "Q", "(ID)V", "", "f0", "(IJ)V", "S0", "(ILjava/lang/String;)V", "i0", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "getLong", "(I)J", "u3", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "Y3", "()Z", "reset", "()V", "o0", "close", "e", "Lbb/c$a$b;", "getOperation", "()Lbb/c$a$b;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class e extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Companion.b operation;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17995a;

            static {
                int[] iArr = new int[Companion.b.values().length];
                try {
                    iArr[Companion.b.END.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Companion.b.ROLLBACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Companion.b.BEGIN_EXCLUSIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Companion.b.BEGIN_IMMEDIATE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Companion.b.BEGIN_DEFERRED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f17995a = iArr;
            }
        }

        public e(za.c cVar, String str, Companion.b bVar) {
            super(cVar, str, null);
            this.operation = bVar;
        }

        @Override // ya.d
        public void Q(int index, double value) {
            p();
            ya.a.b(25, "column index out of range");
            throw new oq.g();
        }

        @Override // ya.d
        public void S0(int index, String value) {
            p();
            ya.a.b(25, "column index out of range");
            throw new oq.g();
        }

        @Override // ya.d
        public boolean Y3() {
            int i15 = a.f17995a[this.operation.ordinal()];
            if (i15 == 1) {
                getDb().X0();
                getDb().r1();
                return false;
            }
            if (i15 == 2) {
                getDb().r1();
                return false;
            }
            if (i15 == 3) {
                getDb().q0();
                return false;
            }
            if (i15 == 4) {
                getDb().b1();
                return false;
            }
            if (i15 != 5) {
                throw new p();
            }
            getDb().H2();
            return false;
        }

        @Override // ya.d, java.lang.AutoCloseable
        public void close() {
            m(true);
        }

        @Override // ya.d
        public void f0(int index, long value) {
            p();
            ya.a.b(25, "column index out of range");
            throw new oq.g();
        }

        @Override // ya.d
        public void g0(int index, byte[] value) {
            p();
            ya.a.b(25, "column index out of range");
            throw new oq.g();
        }

        @Override // ya.d
        public byte[] getBlob(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }

        @Override // ya.d
        public int getColumnCount() {
            p();
            return 0;
        }

        @Override // ya.d
        public String getColumnName(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }

        @Override // ya.d
        public double getDouble(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }

        @Override // ya.d
        public long getLong(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }

        @Override // ya.d
        public void i0(int index) {
            p();
            ya.a.b(25, "column index out of range");
            throw new oq.g();
        }

        @Override // ya.d
        public boolean isNull(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }

        @Override // ya.d
        public void o0() {
            p();
        }

        @Override // ya.d
        public void reset() {
            p();
        }

        @Override // ya.d
        public String u3(int index) {
            p();
            ya.a.b(21, "no row");
            throw new oq.g();
        }
    }

    public /* synthetic */ c(za.c cVar, String str, k kVar) {
        this(cVar, str);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    protected final za.c getDb() {
        return this.db;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    protected final String getSql() {
        return this.sql;
    }

    /* JADX INFO: renamed from: isClosed, reason: from getter */
    protected final boolean getIsClosed() {
        return this.isClosed;
    }

    protected final void m(boolean z15) {
        this.isClosed = z15;
    }

    protected final void p() {
        if (this.isClosed) {
            ya.a.b(21, "statement is closed");
            throw new oq.g();
        }
    }

    private c(za.c cVar, String str) {
        this.db = cVar;
        this.sql = str;
    }
}
