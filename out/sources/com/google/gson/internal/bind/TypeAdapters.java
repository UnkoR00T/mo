package com.google.gson.internal.bind;

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
import wl.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class TypeAdapters {
    public static final com.google.gson.a0<BigInteger> A;
    public static final com.google.gson.a0<wl.z> B;
    public static final com.google.gson.b0 C;
    public static final com.google.gson.a0<StringBuilder> D;
    public static final com.google.gson.b0 E;
    public static final com.google.gson.a0<StringBuffer> F;
    public static final com.google.gson.b0 G;
    public static final com.google.gson.a0<URL> H;
    public static final com.google.gson.b0 I;
    public static final com.google.gson.a0<URI> J;
    public static final com.google.gson.b0 K;
    public static final com.google.gson.a0<InetAddress> L;
    public static final com.google.gson.b0 M;
    public static final com.google.gson.a0<UUID> N;
    public static final com.google.gson.b0 O;
    public static final com.google.gson.a0<Currency> P;
    public static final com.google.gson.b0 Q;
    public static final com.google.gson.a0<Calendar> R;
    public static final com.google.gson.b0 S;
    public static final com.google.gson.a0<Locale> T;
    public static final com.google.gson.b0 U;
    public static final com.google.gson.a0<com.google.gson.l> V;
    public static final com.google.gson.b0 W;
    public static final com.google.gson.b0 X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.gson.a0<Class> f36786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.gson.b0 f36787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.gson.a0<BitSet> f36788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.gson.b0 f36789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.gson.a0<Boolean> f36790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.gson.a0<Boolean> f36791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.gson.b0 f36792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.gson.a0<Number> f36793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.gson.b0 f36794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.google.gson.a0<Number> f36795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.gson.b0 f36796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.gson.a0<Number> f36797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.gson.b0 f36798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.gson.a0<AtomicInteger> f36799n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.gson.b0 f36800o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.gson.a0<AtomicBoolean> f36801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final com.google.gson.b0 f36802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.google.gson.a0<AtomicIntegerArray> f36803r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.google.gson.b0 f36804s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final com.google.gson.a0<Number> f36805t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final com.google.gson.a0<Number> f36806u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final com.google.gson.a0<Number> f36807v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.google.gson.a0<Character> f36808w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final com.google.gson.b0 f36809x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final com.google.gson.a0<String> f36810y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final com.google.gson.a0<BigDecimal> f36811z;

    class a extends com.google.gson.a0<AtomicIntegerArray> {
        a() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(zl.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.h();
            while (aVar.I()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.nextInt()));
                } catch (NumberFormatException e15) {
                    throw new com.google.gson.u(e15);
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

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.p();
            int length = atomicIntegerArray.length();
            for (int i15 = 0; i15 < length; i15++) {
                cVar.t0(atomicIntegerArray.get(i15));
            }
            cVar.y();
        }
    }

    class a0 extends com.google.gson.a0<AtomicInteger> {
        a0() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(zl.a aVar) {
            try {
                return new AtomicInteger(aVar.nextInt());
            } catch (NumberFormatException e15) {
                throw new com.google.gson.u(e15);
            }
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.t0(atomicInteger.get());
        }
    }

    class b extends com.google.gson.a0<Number> {
        b() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
                aVar.O();
                return null;
            }
            try {
                return Long.valueOf(aVar.nextLong());
            } catch (NumberFormatException e15) {
                throw new com.google.gson.u(e15);
            }
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.t0(number.longValue());
            }
        }
    }

    class b0 extends com.google.gson.a0<AtomicBoolean> {
        b0() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(zl.a aVar) {
            return new AtomicBoolean(aVar.M());
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.O0(atomicBoolean.get());
        }
    }

    class c extends com.google.gson.a0<Number> {
        c() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(zl.a aVar) throws IOException {
            if (aVar.a0() != zl.b.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Number number) throws IOException {
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

    class d extends com.google.gson.a0<Number> {
        d() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(zl.a aVar) throws IOException {
            if (aVar.a0() != zl.b.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.n0(number.doubleValue());
            }
        }
    }

    class e extends com.google.gson.a0<Character> {
        e() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
                aVar.O();
                return null;
            }
            String strQ2 = aVar.q2();
            if (strQ2.length() == 1) {
                return Character.valueOf(strQ2.charAt(0));
            }
            throw new com.google.gson.u("Expecting character, got: " + strQ2 + "; at " + aVar.E());
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Character ch4) throws IOException {
            cVar.H0(ch4 == null ? null : String.valueOf(ch4));
        }
    }

    class f extends com.google.gson.a0<String> {
        f() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(zl.a aVar) throws IOException {
            zl.b bVarA0 = aVar.a0();
            if (bVarA0 != zl.b.NULL) {
                return bVarA0 == zl.b.BOOLEAN ? Boolean.toString(aVar.M()) : aVar.q2();
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, String str) throws IOException {
            cVar.H0(str);
        }
    }

    class g extends com.google.gson.a0<BigDecimal> {
        g() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
                aVar.O();
                return null;
            }
            String strQ2 = aVar.q2();
            try {
                return wl.b0.b(strQ2);
            } catch (NumberFormatException e15) {
                throw new com.google.gson.u("Failed parsing '" + strQ2 + "' as BigDecimal; at path " + aVar.E(), e15);
            }
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.C0(bigDecimal);
        }
    }

    class h extends com.google.gson.a0<BigInteger> {
        h() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
                aVar.O();
                return null;
            }
            String strQ2 = aVar.q2();
            try {
                return wl.b0.c(strQ2);
            } catch (NumberFormatException e15) {
                throw new com.google.gson.u("Failed parsing '" + strQ2 + "' as BigInteger; at path " + aVar.E(), e15);
            }
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, BigInteger bigInteger) throws IOException {
            cVar.C0(bigInteger);
        }
    }

    class i extends com.google.gson.a0<wl.z> {
        i() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public wl.z b(zl.a aVar) throws IOException {
            if (aVar.a0() != zl.b.NULL) {
                return new wl.z(aVar.q2());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, wl.z zVar) throws IOException {
            cVar.C0(zVar);
        }
    }

    class j extends com.google.gson.a0<StringBuilder> {
        j() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(zl.a aVar) throws IOException {
            if (aVar.a0() != zl.b.NULL) {
                return new StringBuilder(aVar.q2());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, StringBuilder sb5) throws IOException {
            cVar.H0(sb5 == null ? null : sb5.toString());
        }
    }

    class k extends com.google.gson.a0<Class> {
        k() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(zl.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + h0.a("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + h0.a("java-lang-class-unsupported"));
        }
    }

    class l extends com.google.gson.a0<StringBuffer> {
        l() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(zl.a aVar) throws IOException {
            if (aVar.a0() != zl.b.NULL) {
                return new StringBuffer(aVar.q2());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.H0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends com.google.gson.a0<URL> {
        m() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
                aVar.O();
                return null;
            }
            String strQ2 = aVar.q2();
            if (strQ2.equals("null")) {
                return null;
            }
            return new URL(strQ2);
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, URL url) throws IOException {
            cVar.H0(url == null ? null : url.toExternalForm());
        }
    }

    class n extends com.google.gson.a0<URI> {
        n() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
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
                throw new com.google.gson.m(e15);
            }
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, URI uri) throws IOException {
            cVar.H0(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends com.google.gson.a0<InetAddress> {
        o() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(zl.a aVar) throws IOException {
            if (aVar.a0() != zl.b.NULL) {
                return InetAddress.getByName(aVar.q2());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, InetAddress inetAddress) throws IOException {
            cVar.H0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends com.google.gson.a0<UUID> {
        p() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
                aVar.O();
                return null;
            }
            String strQ2 = aVar.q2();
            try {
                return UUID.fromString(strQ2);
            } catch (IllegalArgumentException e15) {
                throw new com.google.gson.u("Failed parsing '" + strQ2 + "' as UUID; at path " + aVar.E(), e15);
            }
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, UUID uuid) throws IOException {
            cVar.H0(uuid == null ? null : uuid.toString());
        }
    }

    class q extends com.google.gson.a0<Currency> {
        q() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(zl.a aVar) throws IOException {
            String strQ2 = aVar.q2();
            try {
                return Currency.getInstance(strQ2);
            } catch (IllegalArgumentException e15) {
                throw new com.google.gson.u("Failed parsing '" + strQ2 + "' as Currency; at path " + aVar.E(), e15);
            }
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Currency currency) throws IOException {
            cVar.H0(currency.getCurrencyCode());
        }
    }

    class r extends com.google.gson.a0<Calendar> {
        r() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
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
            while (aVar.a0() != zl.b.END_OBJECT) {
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

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Calendar calendar) throws IOException {
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

    class s extends com.google.gson.a0<Locale> {
        s() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
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

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Locale locale) throws IOException {
            cVar.H0(locale == null ? null : locale.toString());
        }
    }

    class t extends com.google.gson.a0<BitSet> {
        t() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(zl.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.h();
            zl.b bVarA0 = aVar.a0();
            int i15 = 0;
            while (bVarA0 != zl.b.END_ARRAY) {
                int i16 = u.f36826a[bVarA0.ordinal()];
                boolean zM = true;
                if (i16 == 1 || i16 == 2) {
                    int iNextInt = aVar.nextInt();
                    if (iNextInt == 0) {
                        zM = false;
                    } else if (iNextInt != 1) {
                        throw new com.google.gson.u("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + aVar.E());
                    }
                } else {
                    if (i16 != 3) {
                        throw new com.google.gson.u("Invalid bitset value type: " + bVarA0 + "; at path " + aVar.W());
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

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, BitSet bitSet) throws IOException {
            cVar.p();
            int length = bitSet.length();
            for (int i15 = 0; i15 < length; i15++) {
                cVar.t0(bitSet.get(i15) ? 1L : 0L);
            }
            cVar.y();
        }
    }

    static /* synthetic */ class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36826a;

        static {
            int[] iArr = new int[zl.b.values().length];
            f36826a = iArr;
            try {
                iArr[zl.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36826a[zl.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36826a[zl.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class v extends com.google.gson.a0<Boolean> {
        v() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(zl.a aVar) throws IOException {
            zl.b bVarA0 = aVar.a0();
            if (bVarA0 != zl.b.NULL) {
                return bVarA0 == zl.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.q2())) : Boolean.valueOf(aVar.M());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Boolean bool) throws IOException {
            cVar.u0(bool);
        }
    }

    class w extends com.google.gson.a0<Boolean> {
        w() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(zl.a aVar) throws IOException {
            if (aVar.a0() != zl.b.NULL) {
                return Boolean.valueOf(aVar.q2());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Boolean bool) throws IOException {
            cVar.H0(bool == null ? "null" : bool.toString());
        }
    }

    class x extends com.google.gson.a0<Number> {
        x() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
                aVar.O();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 255 && iNextInt >= -128) {
                    return Byte.valueOf((byte) iNextInt);
                }
                throw new com.google.gson.u("Lossy conversion from " + iNextInt + " to byte; at path " + aVar.E());
            } catch (NumberFormatException e15) {
                throw new com.google.gson.u(e15);
            }
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.t0(number.byteValue());
            }
        }
    }

    class y extends com.google.gson.a0<Number> {
        y() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
                aVar.O();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 65535 && iNextInt >= -32768) {
                    return Short.valueOf((short) iNextInt);
                }
                throw new com.google.gson.u("Lossy conversion from " + iNextInt + " to short; at path " + aVar.E());
            } catch (NumberFormatException e15) {
                throw new com.google.gson.u(e15);
            }
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.t0(number.shortValue());
            }
        }
    }

    class z extends com.google.gson.a0<Number> {
        z() {
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
                aVar.O();
                return null;
            }
            try {
                return Integer.valueOf(aVar.nextInt());
            } catch (NumberFormatException e15) {
                throw new com.google.gson.u(e15);
            }
        }

        @Override // com.google.gson.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(zl.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.M();
            } else {
                cVar.t0(number.intValue());
            }
        }
    }

    static {
        com.google.gson.a0<Class> a0VarA = new k().a();
        f36786a = a0VarA;
        f36787b = b(Class.class, a0VarA);
        com.google.gson.a0<BitSet> a0VarA2 = new t().a();
        f36788c = a0VarA2;
        f36789d = b(BitSet.class, a0VarA2);
        v vVar = new v();
        f36790e = vVar;
        f36791f = new w();
        f36792g = c(Boolean.TYPE, Boolean.class, vVar);
        x xVar = new x();
        f36793h = xVar;
        f36794i = c(Byte.TYPE, Byte.class, xVar);
        y yVar = new y();
        f36795j = yVar;
        f36796k = c(Short.TYPE, Short.class, yVar);
        z zVar = new z();
        f36797l = zVar;
        f36798m = c(Integer.TYPE, Integer.class, zVar);
        com.google.gson.a0<AtomicInteger> a0VarA3 = new a0().a();
        f36799n = a0VarA3;
        f36800o = b(AtomicInteger.class, a0VarA3);
        com.google.gson.a0<AtomicBoolean> a0VarA4 = new b0().a();
        f36801p = a0VarA4;
        f36802q = b(AtomicBoolean.class, a0VarA4);
        com.google.gson.a0<AtomicIntegerArray> a0VarA5 = new a().a();
        f36803r = a0VarA5;
        f36804s = b(AtomicIntegerArray.class, a0VarA5);
        f36805t = new b();
        f36806u = new c();
        f36807v = new d();
        e eVar = new e();
        f36808w = eVar;
        f36809x = c(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f36810y = fVar;
        f36811z = new g();
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
        M = e(InetAddress.class, oVar);
        p pVar = new p();
        N = pVar;
        O = b(UUID.class, pVar);
        com.google.gson.a0<Currency> a0VarA6 = new q().a();
        P = a0VarA6;
        Q = b(Currency.class, a0VarA6);
        r rVar = new r();
        R = rVar;
        S = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = b(Locale.class, sVar);
        com.google.gson.internal.bind.a aVar = com.google.gson.internal.bind.a.f36827a;
        V = aVar;
        W = e(com.google.gson.l.class, aVar);
        X = EnumTypeAdapter.f36724d;
    }

    public static <TT> com.google.gson.b0 a(final com.google.gson.reflect.a<TT> aVar, final com.google.gson.a0<TT> a0Var) {
        return new com.google.gson.b0() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.b0
            public <T> com.google.gson.a0<T> b(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar2) {
                if (aVar2.equals(aVar)) {
                    return a0Var;
                }
                return null;
            }
        };
    }

    public static <TT> com.google.gson.b0 b(final Class<TT> cls, final com.google.gson.a0<TT> a0Var) {
        return new com.google.gson.b0() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.b0
            public <T> com.google.gson.a0<T> b(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
                if (aVar.c() == cls) {
                    return a0Var;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + a0Var + "]";
            }
        };
    }

    public static <TT> com.google.gson.b0 c(final Class<TT> cls, final Class<TT> cls2, final com.google.gson.a0<? super TT> a0Var) {
        return new com.google.gson.b0() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.b0
            public <T> com.google.gson.a0<T> b(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (clsC == cls || clsC == cls2) {
                    return a0Var;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + a0Var + "]";
            }
        };
    }

    public static <TT> com.google.gson.b0 d(final Class<TT> cls, final Class<? extends TT> cls2, final com.google.gson.a0<? super TT> a0Var) {
        return new com.google.gson.b0() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.b0
            public <T> com.google.gson.a0<T> b(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (clsC == cls || clsC == cls2) {
                    return a0Var;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + a0Var + "]";
            }
        };
    }

    public static <T1> com.google.gson.b0 e(final Class<T1> cls, final com.google.gson.a0<T1> a0Var) {
        return new com.google.gson.b0() { // from class: com.google.gson.internal.bind.TypeAdapters.32

            /* JADX INFO: Add missing generic type declarations: [T1] */
            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$32$a */
            class a<T1> extends com.google.gson.a0<T1> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Class f36824a;

                a(Class cls) {
                    this.f36824a = cls;
                }

                @Override // com.google.gson.a0
                public T1 b(zl.a aVar) {
                    T1 t15 = (T1) a0Var.b(aVar);
                    if (t15 == null || this.f36824a.isInstance(t15)) {
                        return t15;
                    }
                    throw new com.google.gson.u("Expected a " + this.f36824a.getName() + " but was " + t15.getClass().getName() + "; at path " + aVar.E());
                }

                @Override // com.google.gson.a0
                public void d(zl.c cVar, T1 t15) {
                    a0Var.d(cVar, t15);
                }
            }

            @Override // com.google.gson.b0
            public <T2> com.google.gson.a0<T2> b(com.google.gson.f fVar, com.google.gson.reflect.a<T2> aVar) {
                Class<? super T2> clsC = aVar.c();
                if (cls.isAssignableFrom(clsC)) {
                    return new a(clsC);
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + a0Var + "]";
            }
        };
    }
}
