package bo;

import ao.i0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes4.dex */
public final class p {
    public static final yn.z<BigInteger> A;
    public static final yn.z<ao.a0> B;
    public static final yn.a0 C;
    public static final yn.z<StringBuilder> D;
    public static final yn.a0 E;
    public static final yn.z<StringBuffer> F;
    public static final yn.a0 G;
    public static final yn.z<URL> H;
    public static final yn.a0 I;
    public static final yn.z<URI> J;
    public static final yn.a0 K;
    public static final yn.z<InetAddress> L;
    public static final yn.a0 M;
    public static final yn.z<UUID> N;
    public static final yn.a0 O;
    public static final yn.z<Currency> P;
    public static final yn.a0 Q;
    public static final yn.z<Calendar> R;
    public static final yn.a0 S;
    public static final yn.z<Locale> T;
    public static final yn.a0 U;
    public static final yn.z<yn.l> V;
    public static final yn.a0 W;
    public static final yn.a0 X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yn.z<Class> f20536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yn.a0 f20537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yn.z<BitSet> f20538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final yn.a0 f20539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final yn.z<Boolean> f20540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final yn.z<Boolean> f20541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final yn.a0 f20542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final yn.z<Number> f20543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final yn.a0 f20544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final yn.z<Number> f20545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final yn.a0 f20546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final yn.z<Number> f20547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final yn.a0 f20548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final yn.z<AtomicInteger> f20549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yn.a0 f20550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final yn.z<AtomicBoolean> f20551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final yn.a0 f20552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final yn.z<AtomicIntegerArray> f20553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final yn.a0 f20554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final yn.z<Number> f20555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final yn.z<Number> f20556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final yn.z<Number> f20557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final yn.z<Character> f20558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final yn.a0 f20559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final yn.z<String> f20560y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final yn.z<BigDecimal> f20561z;

    class a extends yn.z<AtomicIntegerArray> {
        a() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(ho.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.h();
            while (aVar.I()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.nextInt()));
                } catch (NumberFormatException e15) {
                    throw new yn.t(e15);
                }
            }
            aVar.u();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i15 = 0; i15 < size; i15++) {
                atomicIntegerArray.set(i15, ((Integer) arrayList.get(i15)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.p();
            int length = atomicIntegerArray.length();
            for (int i15 = 0; i15 < length; i15++) {
                cVar.t0(atomicIntegerArray.get(i15));
            }
            cVar.y();
        }
    }

    class a0 extends yn.z<Boolean> {
        a0() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(ho.a aVar) throws IOException {
            if (aVar.a0() != ho.b.NULL) {
                return Boolean.valueOf(aVar.q2());
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Boolean bool) throws IOException {
            cVar.H0(bool == null ? "null" : bool.toString());
        }
    }

    class b extends yn.z<Number> {
        b() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            try {
                return Long.valueOf(aVar.nextLong());
            } catch (NumberFormatException e15) {
                throw new yn.t(e15);
            }
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.t0(number.longValue());
            }
        }
    }

    class b0 extends yn.z<Number> {
        b0() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 255 && iNextInt >= -128) {
                    return Byte.valueOf((byte) iNextInt);
                }
                throw new yn.t("Lossy conversion from " + iNextInt + " to byte; at path " + aVar.E());
            } catch (NumberFormatException e15) {
                throw new yn.t(e15);
            }
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.t0(number.byteValue());
            }
        }
    }

    class c extends yn.z<Number> {
        c() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ho.a aVar) throws IOException {
            if (aVar.a0() != ho.b.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.C0(number);
        }
    }

    class c0 extends yn.z<Number> {
        c0() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 65535 && iNextInt >= -32768) {
                    return Short.valueOf((short) iNextInt);
                }
                throw new yn.t("Lossy conversion from " + iNextInt + " to short; at path " + aVar.E());
            } catch (NumberFormatException e15) {
                throw new yn.t(e15);
            }
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.t0(number.shortValue());
            }
        }
    }

    class d extends yn.z<Number> {
        d() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ho.a aVar) throws IOException {
            if (aVar.a0() != ho.b.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.n0(number.doubleValue());
            }
        }
    }

    class d0 extends yn.z<Number> {
        d0() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            try {
                return Integer.valueOf(aVar.nextInt());
            } catch (NumberFormatException e15) {
                throw new yn.t(e15);
            }
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.t0(number.intValue());
            }
        }
    }

    class e extends yn.z<Character> {
        e() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            String strQ2 = aVar.q2();
            if (strQ2.length() == 1) {
                return Character.valueOf(strQ2.charAt(0));
            }
            throw new yn.t("Expecting character, got: " + strQ2 + "; at " + aVar.E());
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Character ch4) throws IOException {
            cVar.H0(ch4 == null ? null : String.valueOf(ch4));
        }
    }

    class e0 extends yn.z<AtomicInteger> {
        e0() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(ho.a aVar) {
            try {
                return new AtomicInteger(aVar.nextInt());
            } catch (NumberFormatException e15) {
                throw new yn.t(e15);
            }
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.t0(atomicInteger.get());
        }
    }

    class f extends yn.z<String> {
        f() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(ho.a aVar) throws IOException {
            ho.b bVarA0 = aVar.a0();
            if (bVarA0 != ho.b.NULL) {
                return bVarA0 == ho.b.BOOLEAN ? Boolean.toString(aVar.M()) : aVar.q2();
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, String str) throws IOException {
            cVar.H0(str);
        }
    }

    class f0 extends yn.z<AtomicBoolean> {
        f0() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(ho.a aVar) {
            return new AtomicBoolean(aVar.M());
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.O0(atomicBoolean.get());
        }
    }

    class g extends yn.z<BigDecimal> {
        g() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            String strQ2 = aVar.q2();
            try {
                return ao.c0.b(strQ2);
            } catch (NumberFormatException e15) {
                throw new yn.t("Failed parsing '" + strQ2 + "' as BigDecimal; at path " + aVar.E(), e15);
            }
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.C0(bigDecimal);
        }
    }

    class h extends yn.z<BigInteger> {
        h() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            String strQ2 = aVar.q2();
            try {
                return ao.c0.c(strQ2);
            } catch (NumberFormatException e15) {
                throw new yn.t("Failed parsing '" + strQ2 + "' as BigInteger; at path " + aVar.E(), e15);
            }
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, BigInteger bigInteger) throws IOException {
            cVar.C0(bigInteger);
        }
    }

    class i extends yn.z<ao.a0> {
        i() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ao.a0 b(ho.a aVar) throws IOException {
            if (aVar.a0() != ho.b.NULL) {
                return new ao.a0(aVar.q2());
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, ao.a0 a0Var) throws IOException {
            cVar.C0(a0Var);
        }
    }

    class j extends yn.z<StringBuilder> {
        j() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(ho.a aVar) throws IOException {
            if (aVar.a0() != ho.b.NULL) {
                return new StringBuilder(aVar.q2());
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, StringBuilder sb5) throws IOException {
            cVar.H0(sb5 == null ? null : sb5.toString());
        }
    }

    class k extends yn.z<Class> {
        k() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(ho.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + i0.a("java-lang-class-unsupported"));
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + i0.a("java-lang-class-unsupported"));
        }
    }

    class l extends yn.z<StringBuffer> {
        l() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(ho.a aVar) throws IOException {
            if (aVar.a0() != ho.b.NULL) {
                return new StringBuffer(aVar.q2());
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.H0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends yn.z<URL> {
        m() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            String strQ2 = aVar.q2();
            if (strQ2.equals("null")) {
                return null;
            }
            return new URL(strQ2);
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, URL url) throws IOException {
            cVar.H0(url == null ? null : url.toExternalForm());
        }
    }

    class n extends yn.z<URI> {
        n() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            try {
                String strQ2 = aVar.q2();
                if (strQ2.equals("null")) {
                    return null;
                }
                return new URI(strQ2);
            } catch (URISyntaxException e15) {
                throw new yn.m(e15);
            }
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, URI uri) throws IOException {
            cVar.H0(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends yn.z<InetAddress> {
        o() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(ho.a aVar) throws IOException {
            if (aVar.a0() != ho.b.NULL) {
                return InetAddress.getByName(aVar.q2());
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, InetAddress inetAddress) throws IOException {
            cVar.H0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* JADX INFO: renamed from: bo.p$p, reason: collision with other inner class name */
    class C0536p extends yn.z<UUID> {
        C0536p() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            String strQ2 = aVar.q2();
            try {
                return UUID.fromString(strQ2);
            } catch (IllegalArgumentException e15) {
                throw new yn.t("Failed parsing '" + strQ2 + "' as UUID; at path " + aVar.E(), e15);
            }
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, UUID uuid) throws IOException {
            cVar.H0(uuid == null ? null : uuid.toString());
        }
    }

    class q extends yn.z<Currency> {
        q() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(ho.a aVar) throws IOException {
            String strQ2 = aVar.q2();
            try {
                return Currency.getInstance(strQ2);
            } catch (IllegalArgumentException e15) {
                throw new yn.t("Failed parsing '" + strQ2 + "' as Currency; at path " + aVar.E(), e15);
            }
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Currency currency) throws IOException {
            cVar.H0(currency.getCurrencyCode());
        }
    }

    class r extends yn.z<Calendar> {
        r() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            aVar.Y();
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i25 = 0;
            while (aVar.a0() != ho.b.END_OBJECT) {
                String strH1 = aVar.h1();
                int iNextInt = aVar.nextInt();
                strH1.getClass();
                switch (strH1) {
                    case "dayOfMonth":
                        i17 = iNextInt;
                        break;
                    case "minute":
                        i19 = iNextInt;
                        break;
                    case "second":
                        i25 = iNextInt;
                        break;
                    case "year":
                        i15 = iNextInt;
                        break;
                    case "month":
                        i16 = iNextInt;
                        break;
                    case "hourOfDay":
                        i18 = iNextInt;
                        break;
                }
            }
            aVar.h0();
            return new GregorianCalendar(i15, i16, i17, i18, i19, i25);
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.M();
                return;
            }
            cVar.r();
            cVar.K("year");
            cVar.t0(calendar.get(1));
            cVar.K("month");
            cVar.t0(calendar.get(2));
            cVar.K("dayOfMonth");
            cVar.t0(calendar.get(5));
            cVar.K("hourOfDay");
            cVar.t0(calendar.get(11));
            cVar.K("minute");
            cVar.t0(calendar.get(12));
            cVar.K("second");
            cVar.t0(calendar.get(13));
            cVar.C();
        }
    }

    class s extends yn.z<Locale> {
        s() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.q2(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Locale locale) throws IOException {
            cVar.H0(locale == null ? null : locale.toString());
        }
    }

    class t implements yn.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f20562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yn.z f20563b;

        t(Class cls, yn.z zVar) {
            this.f20562a = cls;
            this.f20563b = zVar;
        }

        @Override // yn.a0
        public <T> yn.z<T> b(yn.f fVar, go.a<T> aVar) {
            if (aVar.d() == this.f20562a) {
                return this.f20563b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f20562a.getName() + ",adapter=" + this.f20563b + "]";
        }
    }

    class u extends yn.z<BitSet> {
        u() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(ho.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.h();
            ho.b bVarA0 = aVar.a0();
            int i15 = 0;
            while (bVarA0 != ho.b.END_ARRAY) {
                int i16 = y.f20574a[bVarA0.ordinal()];
                boolean zM = true;
                if (i16 == 1 || i16 == 2) {
                    int iNextInt = aVar.nextInt();
                    if (iNextInt == 0) {
                        zM = false;
                    } else if (iNextInt != 1) {
                        throw new yn.t("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + aVar.E());
                    }
                } else {
                    if (i16 != 3) {
                        throw new yn.t("Invalid bitset value type: " + bVarA0 + "; at path " + aVar.W());
                    }
                    zM = aVar.M();
                }
                if (zM) {
                    bitSet.set(i15);
                }
                i15++;
                bVarA0 = aVar.a0();
            }
            aVar.u();
            return bitSet;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, BitSet bitSet) throws IOException {
            cVar.p();
            int length = bitSet.length();
            for (int i15 = 0; i15 < length; i15++) {
                cVar.t0(bitSet.get(i15) ? 1L : 0L);
            }
            cVar.y();
        }
    }

    class v implements yn.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f20564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f20565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yn.z f20566c;

        v(Class cls, Class cls2, yn.z zVar) {
            this.f20564a = cls;
            this.f20565b = cls2;
            this.f20566c = zVar;
        }

        @Override // yn.a0
        public <T> yn.z<T> b(yn.f fVar, go.a<T> aVar) {
            Class<? super T> clsD = aVar.d();
            if (clsD == this.f20564a || clsD == this.f20565b) {
                return this.f20566c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f20565b.getName() + "+" + this.f20564a.getName() + ",adapter=" + this.f20566c + "]";
        }
    }

    class w implements yn.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f20567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f20568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yn.z f20569c;

        w(Class cls, Class cls2, yn.z zVar) {
            this.f20567a = cls;
            this.f20568b = cls2;
            this.f20569c = zVar;
        }

        @Override // yn.a0
        public <T> yn.z<T> b(yn.f fVar, go.a<T> aVar) {
            Class<? super T> clsD = aVar.d();
            if (clsD == this.f20567a || clsD == this.f20568b) {
                return this.f20569c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f20567a.getName() + "+" + this.f20568b.getName() + ",adapter=" + this.f20569c + "]";
        }
    }

    class x implements yn.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f20570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yn.z f20571b;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        class a<T1> extends yn.z<T1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f20572a;

            a(Class cls) {
                this.f20572a = cls;
            }

            @Override // yn.z
            public T1 b(ho.a aVar) {
                T1 t15 = (T1) x.this.f20571b.b(aVar);
                if (t15 == null || this.f20572a.isInstance(t15)) {
                    return t15;
                }
                throw new yn.t("Expected a " + this.f20572a.getName() + " but was " + t15.getClass().getName() + "; at path " + aVar.E());
            }

            @Override // yn.z
            public void d(ho.c cVar, T1 t15) {
                x.this.f20571b.d(cVar, t15);
            }
        }

        x(Class cls, yn.z zVar) {
            this.f20570a = cls;
            this.f20571b = zVar;
        }

        @Override // yn.a0
        public <T2> yn.z<T2> b(yn.f fVar, go.a<T2> aVar) {
            Class<? super T2> clsD = aVar.d();
            if (this.f20570a.isAssignableFrom(clsD)) {
                return new a(clsD);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f20570a.getName() + ",adapter=" + this.f20571b + "]";
        }
    }

    static /* synthetic */ class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20574a;

        static {
            int[] iArr = new int[ho.b.values().length];
            f20574a = iArr;
            try {
                iArr[ho.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20574a[ho.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20574a[ho.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class z extends yn.z<Boolean> {
        z() {
        }

        @Override // yn.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(ho.a aVar) throws IOException {
            ho.b bVarA0 = aVar.a0();
            if (bVarA0 != ho.b.NULL) {
                return bVarA0 == ho.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.q2())) : Boolean.valueOf(aVar.M());
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ho.c cVar, Boolean bool) throws IOException {
            cVar.u0(bool);
        }
    }

    static {
        yn.z<Class> zVarA = new k().a();
        f20536a = zVarA;
        f20537b = b(Class.class, zVarA);
        yn.z<BitSet> zVarA2 = new u().a();
        f20538c = zVarA2;
        f20539d = b(BitSet.class, zVarA2);
        z zVar = new z();
        f20540e = zVar;
        f20541f = new a0();
        f20542g = a(Boolean.TYPE, Boolean.class, zVar);
        b0 b0Var = new b0();
        f20543h = b0Var;
        f20544i = a(Byte.TYPE, Byte.class, b0Var);
        c0 c0Var = new c0();
        f20545j = c0Var;
        f20546k = a(Short.TYPE, Short.class, c0Var);
        d0 d0Var = new d0();
        f20547l = d0Var;
        f20548m = a(Integer.TYPE, Integer.class, d0Var);
        yn.z<AtomicInteger> zVarA3 = new e0().a();
        f20549n = zVarA3;
        f20550o = b(AtomicInteger.class, zVarA3);
        yn.z<AtomicBoolean> zVarA4 = new f0().a();
        f20551p = zVarA4;
        f20552q = b(AtomicBoolean.class, zVarA4);
        yn.z<AtomicIntegerArray> zVarA5 = new a().a();
        f20553r = zVarA5;
        f20554s = b(AtomicIntegerArray.class, zVarA5);
        f20555t = new b();
        f20556u = new c();
        f20557v = new d();
        e eVar = new e();
        f20558w = eVar;
        f20559x = a(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f20560y = fVar;
        f20561z = new g();
        A = new h();
        B = new i();
        C = b(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = b(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = b(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = b(URL.class, mVar);
        n nVar = new n();
        J = nVar;
        K = b(URI.class, nVar);
        o oVar = new o();
        L = oVar;
        M = d(InetAddress.class, oVar);
        C0536p c0536p = new C0536p();
        N = c0536p;
        O = b(UUID.class, c0536p);
        yn.z<Currency> zVarA6 = new q().a();
        P = zVarA6;
        Q = b(Currency.class, zVarA6);
        r rVar = new r();
        R = rVar;
        S = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = b(Locale.class, sVar);
        bo.f fVar2 = bo.f.f20477a;
        V = fVar2;
        W = d(yn.l.class, fVar2);
        X = bo.d.f20469d;
    }

    public static <TT> yn.a0 a(Class<TT> cls, Class<TT> cls2, yn.z<? super TT> zVar) {
        return new v(cls, cls2, zVar);
    }

    public static <TT> yn.a0 b(Class<TT> cls, yn.z<TT> zVar) {
        return new t(cls, zVar);
    }

    public static <TT> yn.a0 c(Class<TT> cls, Class<? extends TT> cls2, yn.z<? super TT> zVar) {
        return new w(cls, cls2, zVar);
    }

    public static <T1> yn.a0 d(Class<T1> cls, yn.z<T1> zVar) {
        return new x(cls, zVar);
    }
}
