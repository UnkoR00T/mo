package fr;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lfr/x0;", "Lfr/v;", "c", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0 extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fr.x0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfr/x0$a;", "", "<init>", "()V", "Lmr/q;", "typeParameter", "", "a", "(Lmr/q;)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: fr.x0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class C1476a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f66422a;

            static {
                int[] iArr = new int[mr.s.values().length];
                try {
                    iArr[mr.s.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[mr.s.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[mr.s.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f66422a = iArr;
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String a(mr.q typeParameter) {
            StringBuilder sb5 = new StringBuilder();
            int i15 = C1476a.f66422a[typeParameter.q().ordinal()];
            if (i15 == 1) {
                oq.i0 i0Var = oq.i0.f148189a;
            } else if (i15 == 2) {
                sb5.append("in ");
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                sb5.append("out ");
            }
            sb5.append(typeParameter.getName());
            return sb5.toString();
        }

        private Companion() {
        }
    }
}
