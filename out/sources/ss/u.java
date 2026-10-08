package ss;

/* JADX INFO: loaded from: classes4.dex */
final class u implements t<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f183939a = new u();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f183940a;

        static {
            int[] iArr = new int[sr.m.values().length];
            try {
                iArr[sr.m.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sr.m.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sr.m.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sr.m.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[sr.m.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[sr.m.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[sr.m.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[sr.m.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f183940a = iArr;
        }
    }

    private u() {
    }

    @Override // ss.t
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public s b(s sVar) {
        if (!(sVar instanceof s.d)) {
            return sVar;
        }
        s.d dVar = (s.d) sVar;
        return dVar.i() != null ? e(jt.d.c(dVar.i().o()).f()) : sVar;
    }

    @Override // ss.t
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public s a(String str) {
        jt.e eVar;
        str.length();
        char cCharAt = str.charAt(0);
        jt.e[] eVarArrValues = jt.e.values();
        int length = eVarArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i15];
            if (eVar.j().charAt(0) == cCharAt) {
                break;
            }
            i15++;
        }
        if (eVar != null) {
            return new s.d(eVar);
        }
        if (cCharAt == 'V') {
            return new s.d(null);
        }
        if (cCharAt == '[') {
            return new s.a(a(str.substring(1)));
        }
        if (cCharAt == 'L') {
            fu.r.g0(str, ';', false, 2, null);
        }
        return new s.c(str.substring(1, str.length() - 1));
    }

    @Override // ss.t
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public s.c e(String str) {
        return new s.c(str);
    }

    @Override // ss.t
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public s d(sr.m mVar) {
        switch (a.f183940a[mVar.ordinal()]) {
            case 1:
                return s.f183927a.a();
            case 2:
                return s.f183927a.c();
            case 3:
                return s.f183927a.b();
            case 4:
                return s.f183927a.h();
            case 5:
                return s.f183927a.f();
            case 6:
                return s.f183927a.e();
            case 7:
                return s.f183927a.g();
            case 8:
                return s.f183927a.d();
            default:
                throw new oq.p();
        }
    }

    @Override // ss.t
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public s f() {
        return e("java/lang/Class");
    }

    @Override // ss.t
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String c(s sVar) {
        String strJ;
        if (sVar instanceof s.a) {
            return '[' + c(((s.a) sVar).i());
        }
        if (sVar instanceof s.d) {
            jt.e eVarI = ((s.d) sVar).i();
            return (eVarI == null || (strJ = eVarI.j()) == null) ? "V" : strJ;
        }
        if (!(sVar instanceof s.c)) {
            throw new oq.p();
        }
        return 'L' + ((s.c) sVar).i() + ';';
    }
}
