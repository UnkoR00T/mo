package xs;

import bt.f;
import bt.g;
import bt.i;
import bt.k;
import bt.s;
import bt.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import us.j;
import us.m;
import us.o;
import us.r;
import us.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.f<us.e, c> f220663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i.f<j, c> f220664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i.f<j, Integer> f220665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i.f<o, d> f220666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i.f<o, Integer> f220667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i.f<r, List<us.b>> f220668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i.f<r, Boolean> f220669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i.f<t, List<us.b>> f220670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i.f<us.c, Integer> f220671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i.f<us.c, List<o>> f220672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i.f<us.c, Integer> f220673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i.f<us.c, Integer> f220674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i.f<m, Integer> f220675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i.f<m, List<o>> f220676n;

    public static final class e extends i implements bt.r {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final e f220716h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static s<e> f220717j = new C5906a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bt.d f220718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<c> f220719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Integer> f220720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f220721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f220722f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f220723g;

        /* JADX INFO: renamed from: xs.a$e$a, reason: collision with other inner class name */
        static class C5906a extends bt.b<e> {
            C5906a() {
            }

            @Override // bt.s
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public e b(bt.e eVar, g gVar) {
                return new e(eVar, gVar);
            }
        }

        public static final class b extends i.b<e, b> implements bt.r {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f220724b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List<c> f220725c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List<Integer> f220726d;

            private b() {
                List list = Collections.EMPTY_LIST;
                this.f220725c = list;
                this.f220726d = list;
                D();
            }

            private void A() {
                if ((this.f220724b & 1) != 1) {
                    this.f220725c = new ArrayList(this.f220725c);
                    this.f220724b |= 1;
                }
            }

            private void D() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b y() {
                return new b();
            }

            private void z() {
                if ((this.f220724b & 2) != 2) {
                    this.f220726d = new ArrayList(this.f220726d);
                    this.f220724b |= 2;
                }
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // bt.a.AbstractC0557a
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public b l(bt.e eVar, g gVar) throws Throwable {
                e eVar2 = null;
                try {
                    try {
                        e eVarB = e.f220717j.b(eVar, gVar);
                        if (eVarB != null) {
                            q(eVarB);
                        }
                        return this;
                    } catch (k e15) {
                        e eVar3 = (e) e15.a();
                        try {
                            throw e15;
                        } catch (Throwable th4) {
                            th = th4;
                            eVar2 = eVar3;
                            if (eVar2 != null) {
                                q(eVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (eVar2 != null) {
                        q(eVar2);
                    }
                    throw th;
                }
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b q(e eVar) {
                if (eVar == e.A()) {
                    return this;
                }
                if (!eVar.f220719c.isEmpty()) {
                    if (this.f220725c.isEmpty()) {
                        this.f220725c = eVar.f220719c;
                        this.f220724b &= -2;
                    } else {
                        A();
                        this.f220725c.addAll(eVar.f220719c);
                    }
                }
                if (!eVar.f220720d.isEmpty()) {
                    if (this.f220726d.isEmpty()) {
                        this.f220726d = eVar.f220720d;
                        this.f220724b &= -3;
                    } else {
                        z();
                        this.f220726d.addAll(eVar.f220720d);
                    }
                }
                s(p().f(eVar.f220718b));
                return this;
            }

            @Override // bt.q.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public e build() {
                e eVarW = w();
                if (eVarW.c()) {
                    return eVarW;
                }
                throw bt.a.AbstractC0557a.n(eVarW);
            }

            public e w() {
                e eVar = new e(this);
                if ((this.f220724b & 1) == 1) {
                    this.f220725c = Collections.unmodifiableList(this.f220725c);
                    this.f220724b &= -2;
                }
                eVar.f220719c = this.f220725c;
                if ((this.f220724b & 2) == 2) {
                    this.f220726d = Collections.unmodifiableList(this.f220726d);
                    this.f220724b &= -3;
                }
                eVar.f220720d = this.f220726d;
                return eVar;
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b o() {
                return y().q(w());
            }
        }

        static {
            e eVar = new e(true);
            f220716h = eVar;
            eVar.D();
        }

        public static e A() {
            return f220716h;
        }

        private void D() {
            List list = Collections.EMPTY_LIST;
            this.f220719c = list;
            this.f220720d = list;
        }

        public static b E() {
            return b.y();
        }

        public static b F(e eVar) {
            return E().q(eVar);
        }

        public static e H(InputStream inputStream, g gVar) {
            return f220717j.a(inputStream, gVar);
        }

        public List<Integer> B() {
            return this.f220720d;
        }

        public List<c> C() {
            return this.f220719c;
        }

        @Override // bt.q
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b g() {
            return E();
        }

        @Override // bt.q
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public b b() {
            return F(this);
        }

        @Override // bt.r
        public final boolean c() {
            byte b15 = this.f220722f;
            if (b15 == 1) {
                return true;
            }
            if (b15 == 0) {
                return false;
            }
            this.f220722f = (byte) 1;
            return true;
        }

        @Override // bt.q
        public int e() {
            int i15 = this.f220723g;
            if (i15 != -1) {
                return i15;
            }
            int iS = 0;
            for (int i16 = 0; i16 < this.f220719c.size(); i16++) {
                iS += f.s(1, this.f220719c.get(i16));
            }
            int iP = 0;
            for (int i17 = 0; i17 < this.f220720d.size(); i17++) {
                iP += f.p(this.f220720d.get(i17).intValue());
            }
            int iP2 = iS + iP;
            if (!B().isEmpty()) {
                iP2 = iP2 + 1 + f.p(iP);
            }
            this.f220721e = iP;
            int size = iP2 + this.f220718b.size();
            this.f220723g = size;
            return size;
        }

        @Override // bt.i, bt.q
        public s<e> j() {
            return f220717j;
        }

        @Override // bt.q
        public void m(f fVar) throws IOException {
            e();
            for (int i15 = 0; i15 < this.f220719c.size(); i15++) {
                fVar.d0(1, this.f220719c.get(i15));
            }
            if (B().size() > 0) {
                fVar.o0(42);
                fVar.o0(this.f220721e);
            }
            for (int i16 = 0; i16 < this.f220720d.size(); i16++) {
                fVar.b0(this.f220720d.get(i16).intValue());
            }
            fVar.i0(this.f220718b);
        }

        public static final class c extends i implements bt.r {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private static final c f220727p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static s<c> f220728q = new C5907a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final bt.d f220729b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f220730c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f220731d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f220732e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Object f220733f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private EnumC5908c f220734g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List<Integer> f220735h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f220736j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private List<Integer> f220737k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f220738l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private byte f220739m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f220740n;

            /* JADX INFO: renamed from: xs.a$e$c$a, reason: collision with other inner class name */
            static class C5907a extends bt.b<c> {
                C5907a() {
                }

                @Override // bt.s
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public c b(bt.e eVar, g gVar) {
                    return new c(eVar, gVar);
                }
            }

            public static final class b extends i.b<c, b> implements bt.r {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f220741b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f220743d;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private List<Integer> f220746g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private List<Integer> f220747h;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f220742c = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Object f220744e = "";

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private EnumC5908c f220745f = EnumC5908c.NONE;

                private b() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.f220746g = list;
                    this.f220747h = list;
                    D();
                }

                private void A() {
                    if ((this.f220741b & 16) != 16) {
                        this.f220746g = new ArrayList(this.f220746g);
                        this.f220741b |= 16;
                    }
                }

                private void D() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b y() {
                    return new b();
                }

                private void z() {
                    if ((this.f220741b & 32) != 32) {
                        this.f220747h = new ArrayList(this.f220747h);
                        this.f220741b |= 32;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // bt.a.AbstractC0557a
                /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
                public b l(bt.e eVar, g gVar) throws Throwable {
                    c cVar = null;
                    try {
                        try {
                            c cVarB = c.f220728q.b(eVar, gVar);
                            if (cVarB != null) {
                                q(cVarB);
                            }
                            return this;
                        } catch (k e15) {
                            c cVar2 = (c) e15.a();
                            try {
                                throw e15;
                            } catch (Throwable th4) {
                                th = th4;
                                cVar = cVar2;
                                if (cVar != null) {
                                    q(cVar);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (cVar != null) {
                            q(cVar);
                        }
                        throw th;
                    }
                }

                @Override // bt.i.b
                /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
                public b q(c cVar) {
                    if (cVar == c.G()) {
                        return this;
                    }
                    if (cVar.U()) {
                        J(cVar.J());
                    }
                    if (cVar.T()) {
                        I(cVar.I());
                    }
                    if (cVar.V()) {
                        this.f220741b |= 4;
                        this.f220744e = cVar.f220733f;
                    }
                    if (cVar.R()) {
                        H(cVar.H());
                    }
                    if (!cVar.f220735h.isEmpty()) {
                        if (this.f220746g.isEmpty()) {
                            this.f220746g = cVar.f220735h;
                            this.f220741b &= -17;
                        } else {
                            A();
                            this.f220746g.addAll(cVar.f220735h);
                        }
                    }
                    if (!cVar.f220737k.isEmpty()) {
                        if (this.f220747h.isEmpty()) {
                            this.f220747h = cVar.f220737k;
                            this.f220741b &= -33;
                        } else {
                            z();
                            this.f220747h.addAll(cVar.f220737k);
                        }
                    }
                    s(p().f(cVar.f220729b));
                    return this;
                }

                public b H(EnumC5908c enumC5908c) {
                    enumC5908c.getClass();
                    this.f220741b |= 8;
                    this.f220745f = enumC5908c;
                    return this;
                }

                public b I(int i15) {
                    this.f220741b |= 2;
                    this.f220743d = i15;
                    return this;
                }

                public b J(int i15) {
                    this.f220741b |= 1;
                    this.f220742c = i15;
                    return this;
                }

                @Override // bt.q.a
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarW = w();
                    if (cVarW.c()) {
                        return cVarW;
                    }
                    throw bt.a.AbstractC0557a.n(cVarW);
                }

                public c w() {
                    c cVar = new c(this);
                    int i15 = this.f220741b;
                    int i16 = (i15 & 1) != 1 ? 0 : 1;
                    cVar.f220731d = this.f220742c;
                    if ((i15 & 2) == 2) {
                        i16 |= 2;
                    }
                    cVar.f220732e = this.f220743d;
                    if ((i15 & 4) == 4) {
                        i16 |= 4;
                    }
                    cVar.f220733f = this.f220744e;
                    if ((i15 & 8) == 8) {
                        i16 |= 8;
                    }
                    cVar.f220734g = this.f220745f;
                    if ((this.f220741b & 16) == 16) {
                        this.f220746g = Collections.unmodifiableList(this.f220746g);
                        this.f220741b &= -17;
                    }
                    cVar.f220735h = this.f220746g;
                    if ((this.f220741b & 32) == 32) {
                        this.f220747h = Collections.unmodifiableList(this.f220747h);
                        this.f220741b &= -33;
                    }
                    cVar.f220737k = this.f220747h;
                    cVar.f220730c = i16;
                    return cVar;
                }

                @Override // bt.i.b
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                public b o() {
                    return y().q(w());
                }
            }

            /* JADX INFO: renamed from: xs.a$e$c$c, reason: collision with other inner class name */
            public enum EnumC5908c implements bt.j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static bt.j.b<EnumC5908c> f220751e = new C5909a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f220753a;

                /* JADX INFO: renamed from: xs.a$e$c$c$a, reason: collision with other inner class name */
                static class C5909a implements bt.j.b<EnumC5908c> {
                    C5909a() {
                    }

                    @Override // bt.j.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC5908c a(int i15) {
                        return EnumC5908c.b(i15);
                    }
                }

                EnumC5908c(int i15, int i16) {
                    this.f220753a = i16;
                }

                public static EnumC5908c b(int i15) {
                    if (i15 == 0) {
                        return NONE;
                    }
                    if (i15 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i15 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // bt.j.a
                public final int h() {
                    return this.f220753a;
                }
            }

            static {
                c cVar = new c(true);
                f220727p = cVar;
                cVar.W();
            }

            public static c G() {
                return f220727p;
            }

            private void W() {
                this.f220731d = 1;
                this.f220732e = 0;
                this.f220733f = "";
                this.f220734g = EnumC5908c.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                this.f220735h = list;
                this.f220737k = list;
            }

            public static b X() {
                return b.y();
            }

            public static b Y(c cVar) {
                return X().q(cVar);
            }

            public EnumC5908c H() {
                return this.f220734g;
            }

            public int I() {
                return this.f220732e;
            }

            public int J() {
                return this.f220731d;
            }

            public int K() {
                return this.f220737k.size();
            }

            public List<Integer> L() {
                return this.f220737k;
            }

            public String M() {
                Object obj = this.f220733f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                bt.d dVar = (bt.d) obj;
                String strB = dVar.B();
                if (dVar.q()) {
                    this.f220733f = strB;
                }
                return strB;
            }

            public bt.d N() {
                Object obj = this.f220733f;
                if (!(obj instanceof String)) {
                    return (bt.d) obj;
                }
                bt.d dVarJ = bt.d.j((String) obj);
                this.f220733f = dVarJ;
                return dVarJ;
            }

            public int O() {
                return this.f220735h.size();
            }

            public List<Integer> Q() {
                return this.f220735h;
            }

            public boolean R() {
                return (this.f220730c & 8) == 8;
            }

            public boolean T() {
                return (this.f220730c & 2) == 2;
            }

            public boolean U() {
                return (this.f220730c & 1) == 1;
            }

            public boolean V() {
                return (this.f220730c & 4) == 4;
            }

            @Override // bt.q
            /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
            public b g() {
                return X();
            }

            @Override // bt.q
            /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
            public b b() {
                return Y(this);
            }

            @Override // bt.r
            public final boolean c() {
                byte b15 = this.f220739m;
                if (b15 == 1) {
                    return true;
                }
                if (b15 == 0) {
                    return false;
                }
                this.f220739m = (byte) 1;
                return true;
            }

            @Override // bt.q
            public int e() {
                int i15 = this.f220740n;
                if (i15 != -1) {
                    return i15;
                }
                int iO = (this.f220730c & 1) == 1 ? f.o(1, this.f220731d) : 0;
                if ((this.f220730c & 2) == 2) {
                    iO += f.o(2, this.f220732e);
                }
                if ((this.f220730c & 8) == 8) {
                    iO += f.h(3, this.f220734g.h());
                }
                int iP = 0;
                for (int i16 = 0; i16 < this.f220735h.size(); i16++) {
                    iP += f.p(this.f220735h.get(i16).intValue());
                }
                int iP2 = iO + iP;
                if (!Q().isEmpty()) {
                    iP2 = iP2 + 1 + f.p(iP);
                }
                this.f220736j = iP;
                int iP3 = 0;
                for (int i17 = 0; i17 < this.f220737k.size(); i17++) {
                    iP3 += f.p(this.f220737k.get(i17).intValue());
                }
                int iD = iP2 + iP3;
                if (!L().isEmpty()) {
                    iD = iD + 1 + f.p(iP3);
                }
                this.f220738l = iP3;
                if ((this.f220730c & 4) == 4) {
                    iD += f.d(6, N());
                }
                int size = iD + this.f220729b.size();
                this.f220740n = size;
                return size;
            }

            @Override // bt.i, bt.q
            public s<c> j() {
                return f220728q;
            }

            @Override // bt.q
            public void m(f fVar) throws IOException {
                e();
                if ((this.f220730c & 1) == 1) {
                    fVar.a0(1, this.f220731d);
                }
                if ((this.f220730c & 2) == 2) {
                    fVar.a0(2, this.f220732e);
                }
                if ((this.f220730c & 8) == 8) {
                    fVar.S(3, this.f220734g.h());
                }
                if (Q().size() > 0) {
                    fVar.o0(34);
                    fVar.o0(this.f220736j);
                }
                for (int i15 = 0; i15 < this.f220735h.size(); i15++) {
                    fVar.b0(this.f220735h.get(i15).intValue());
                }
                if (L().size() > 0) {
                    fVar.o0(42);
                    fVar.o0(this.f220738l);
                }
                for (int i16 = 0; i16 < this.f220737k.size(); i16++) {
                    fVar.b0(this.f220737k.get(i16).intValue());
                }
                if ((this.f220730c & 4) == 4) {
                    fVar.O(6, N());
                }
                fVar.i0(this.f220729b);
            }

            private c(i.b bVar) {
                super(bVar);
                this.f220736j = -1;
                this.f220738l = -1;
                this.f220739m = (byte) -1;
                this.f220740n = -1;
                this.f220729b = bVar.p();
            }

            private c(boolean z15) {
                this.f220736j = -1;
                this.f220738l = -1;
                this.f220739m = (byte) -1;
                this.f220740n = -1;
                this.f220729b = bt.d.f21388a;
            }

            private c(bt.e eVar, g gVar) {
                this.f220736j = -1;
                this.f220738l = -1;
                this.f220739m = (byte) -1;
                this.f220740n = -1;
                W();
                bt.d.b bVarU = bt.d.u();
                f fVarJ = f.J(bVarU, 1);
                boolean z15 = false;
                int i15 = 0;
                while (!z15) {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f220730c |= 1;
                                    this.f220731d = eVar.s();
                                } else if (iK == 16) {
                                    this.f220730c |= 2;
                                    this.f220732e = eVar.s();
                                } else if (iK == 24) {
                                    int iN = eVar.n();
                                    EnumC5908c enumC5908cB = EnumC5908c.b(iN);
                                    if (enumC5908cB == null) {
                                        fVarJ.o0(iK);
                                        fVarJ.o0(iN);
                                    } else {
                                        this.f220730c |= 8;
                                        this.f220734g = enumC5908cB;
                                    }
                                } else if (iK == 32) {
                                    if ((i15 & 16) != 16) {
                                        this.f220735h = new ArrayList();
                                        i15 |= 16;
                                    }
                                    this.f220735h.add(Integer.valueOf(eVar.s()));
                                } else if (iK == 34) {
                                    int iJ = eVar.j(eVar.A());
                                    if ((i15 & 16) != 16 && eVar.e() > 0) {
                                        this.f220735h = new ArrayList();
                                        i15 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f220735h.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ);
                                } else if (iK == 40) {
                                    if ((i15 & 32) != 32) {
                                        this.f220737k = new ArrayList();
                                        i15 |= 32;
                                    }
                                    this.f220737k.add(Integer.valueOf(eVar.s()));
                                } else if (iK == 42) {
                                    int iJ2 = eVar.j(eVar.A());
                                    if ((i15 & 32) != 32 && eVar.e() > 0) {
                                        this.f220737k = new ArrayList();
                                        i15 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f220737k.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(iJ2);
                                } else if (iK != 50) {
                                    if (!r(eVar, fVarJ, gVar, iK)) {
                                    }
                                } else {
                                    bt.d dVarL = eVar.l();
                                    this.f220730c |= 4;
                                    this.f220733f = dVarL;
                                }
                            }
                            z15 = true;
                        } catch (Throwable th4) {
                            if ((i15 & 16) == 16) {
                                this.f220735h = Collections.unmodifiableList(this.f220735h);
                            }
                            if ((i15 & 32) == 32) {
                                this.f220737k = Collections.unmodifiableList(this.f220737k);
                            }
                            try {
                                fVarJ.I();
                            } catch (IOException unused) {
                            } finally {
                                this.f220729b = bVarU.r();
                            }
                            n();
                            throw th4;
                        }
                    } catch (k e15) {
                        throw e15.i(this);
                    } catch (IOException e16) {
                        throw new k(e16.getMessage()).i(this);
                    }
                }
                if ((i15 & 16) == 16) {
                    this.f220735h = Collections.unmodifiableList(this.f220735h);
                }
                if ((i15 & 32) == 32) {
                    this.f220737k = Collections.unmodifiableList(this.f220737k);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused2) {
                } finally {
                    this.f220729b = bVarU.r();
                }
                n();
            }
        }

        private e(i.b bVar) {
            super(bVar);
            this.f220721e = -1;
            this.f220722f = (byte) -1;
            this.f220723g = -1;
            this.f220718b = bVar.p();
        }

        private e(boolean z15) {
            this.f220721e = -1;
            this.f220722f = (byte) -1;
            this.f220723g = -1;
            this.f220718b = bt.d.f21388a;
        }

        private e(bt.e eVar, g gVar) {
            this.f220721e = -1;
            this.f220722f = (byte) -1;
            this.f220723g = -1;
            D();
            bt.d.b bVarU = bt.d.u();
            f fVarJ = f.J(bVarU, 1);
            boolean z15 = false;
            int i15 = 0;
            while (!z15) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                if ((i15 & 1) != 1) {
                                    this.f220719c = new ArrayList();
                                    i15 |= 1;
                                }
                                this.f220719c.add((c) eVar.u(c.f220728q, gVar));
                            } else if (iK == 40) {
                                if ((i15 & 2) != 2) {
                                    this.f220720d = new ArrayList();
                                    i15 |= 2;
                                }
                                this.f220720d.add(Integer.valueOf(eVar.s()));
                            } else if (iK != 42) {
                                if (!r(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                int iJ = eVar.j(eVar.A());
                                if ((i15 & 2) != 2 && eVar.e() > 0) {
                                    this.f220720d = new ArrayList();
                                    i15 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f220720d.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(iJ);
                            }
                        }
                        z15 = true;
                    } catch (k e15) {
                        throw e15.i(this);
                    } catch (IOException e16) {
                        throw new k(e16.getMessage()).i(this);
                    }
                } catch (Throwable th4) {
                    if ((i15 & 1) == 1) {
                        this.f220719c = Collections.unmodifiableList(this.f220719c);
                    }
                    if ((i15 & 2) == 2) {
                        this.f220720d = Collections.unmodifiableList(this.f220720d);
                    }
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f220718b = bVarU.r();
                    }
                    n();
                    throw th4;
                }
            }
            if ((i15 & 1) == 1) {
                this.f220719c = Collections.unmodifiableList(this.f220719c);
            }
            if ((i15 & 2) == 2) {
                this.f220720d = Collections.unmodifiableList(this.f220720d);
            }
            try {
                fVarJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f220718b = bVarU.r();
            }
            n();
        }
    }

    static {
        us.e eVarW = us.e.W();
        c cVarY = c.y();
        c cVarY2 = c.y();
        z.b bVar = z.b.f21517n;
        f220663a = i.p(eVarW, cVarY, cVarY2, null, 100, bVar, c.class);
        f220664b = i.p(j.x0(), c.y(), c.y(), null, 100, bVar, c.class);
        j jVarX0 = j.x0();
        z.b bVar2 = z.b.f21511g;
        f220665c = i.p(jVarX0, 0, null, null, 101, bVar2, Integer.class);
        f220666d = i.p(o.G0(), d.C(), d.C(), null, 100, bVar, d.class);
        f220667e = i.p(o.G0(), 0, null, null, 101, bVar2, Integer.class);
        f220668f = i.o(r.e0(), us.b.D(), null, 100, bVar, false, us.b.class);
        f220669g = i.p(r.e0(), Boolean.FALSE, null, null, 101, z.b.f21514k, Boolean.class);
        f220670h = i.o(t.O(), us.b.D(), null, 100, bVar, false, us.b.class);
        f220671i = i.p(us.c.I0(), 0, null, null, 101, bVar2, Integer.class);
        f220672j = i.o(us.c.I0(), o.G0(), null, 102, bVar, false, o.class);
        f220673k = i.p(us.c.I0(), 0, null, null, 103, bVar2, Integer.class);
        f220674l = i.p(us.c.I0(), 0, null, null, 104, bVar2, Integer.class);
        f220675m = i.p(m.O(), 0, null, null, 101, bVar2, Integer.class);
        f220676n = i.o(m.O(), o.G0(), null, 102, bVar, false, o.class);
    }

    public static void a(g gVar) {
        gVar.a(f220663a);
        gVar.a(f220664b);
        gVar.a(f220665c);
        gVar.a(f220666d);
        gVar.a(f220667e);
        gVar.a(f220668f);
        gVar.a(f220669g);
        gVar.a(f220670h);
        gVar.a(f220671i);
        gVar.a(f220672j);
        gVar.a(f220673k);
        gVar.a(f220674l);
        gVar.a(f220675m);
        gVar.a(f220676n);
    }

    public static final class b extends i implements bt.r {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final b f220677h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static s<b> f220678j = new C5902a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bt.d f220679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f220680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f220681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f220682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f220683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f220684g;

        /* JADX INFO: renamed from: xs.a$b$a, reason: collision with other inner class name */
        static class C5902a extends bt.b<b> {
            C5902a() {
            }

            @Override // bt.s
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b b(bt.e eVar, g gVar) {
                return new b(eVar, gVar);
            }
        }

        /* JADX INFO: renamed from: xs.a$b$b, reason: collision with other inner class name */
        public static final class C5903b extends i.b<b, C5903b> implements bt.r {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f220685b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f220686c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f220687d;

            private C5903b() {
                z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C5903b y() {
                return new C5903b();
            }

            private void z() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // bt.a.AbstractC0557a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public C5903b l(bt.e eVar, g gVar) throws Throwable {
                b bVar = null;
                try {
                    try {
                        b bVarB = b.f220678j.b(eVar, gVar);
                        if (bVarB != null) {
                            q(bVarB);
                        }
                        return this;
                    } catch (k e15) {
                        b bVar2 = (b) e15.a();
                        try {
                            throw e15;
                        } catch (Throwable th4) {
                            th = th4;
                            bVar = bVar2;
                            if (bVar != null) {
                                q(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (bVar != null) {
                        q(bVar);
                    }
                    throw th;
                }
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public C5903b q(b bVar) {
                if (bVar == b.y()) {
                    return this;
                }
                if (bVar.D()) {
                    G(bVar.B());
                }
                if (bVar.C()) {
                    F(bVar.A());
                }
                s(p().f(bVar.f220679b));
                return this;
            }

            public C5903b F(int i15) {
                this.f220685b |= 2;
                this.f220687d = i15;
                return this;
            }

            public C5903b G(int i15) {
                this.f220685b |= 1;
                this.f220686c = i15;
                return this;
            }

            @Override // bt.q.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b build() {
                b bVarW = w();
                if (bVarW.c()) {
                    return bVarW;
                }
                throw bt.a.AbstractC0557a.n(bVarW);
            }

            public b w() {
                b bVar = new b(this);
                int i15 = this.f220685b;
                int i16 = (i15 & 1) != 1 ? 0 : 1;
                bVar.f220681d = this.f220686c;
                if ((i15 & 2) == 2) {
                    i16 |= 2;
                }
                bVar.f220682e = this.f220687d;
                bVar.f220680c = i16;
                return bVar;
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public C5903b o() {
                return y().q(w());
            }
        }

        static {
            b bVar = new b(true);
            f220677h = bVar;
            bVar.E();
        }

        private void E() {
            this.f220681d = 0;
            this.f220682e = 0;
        }

        public static C5903b F() {
            return C5903b.y();
        }

        public static C5903b G(b bVar) {
            return F().q(bVar);
        }

        public static b y() {
            return f220677h;
        }

        public int A() {
            return this.f220682e;
        }

        public int B() {
            return this.f220681d;
        }

        public boolean C() {
            return (this.f220680c & 2) == 2;
        }

        public boolean D() {
            return (this.f220680c & 1) == 1;
        }

        @Override // bt.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public C5903b g() {
            return F();
        }

        @Override // bt.q
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public C5903b b() {
            return G(this);
        }

        @Override // bt.r
        public final boolean c() {
            byte b15 = this.f220683f;
            if (b15 == 1) {
                return true;
            }
            if (b15 == 0) {
                return false;
            }
            this.f220683f = (byte) 1;
            return true;
        }

        @Override // bt.q
        public int e() {
            int i15 = this.f220684g;
            if (i15 != -1) {
                return i15;
            }
            int iO = (this.f220680c & 1) == 1 ? f.o(1, this.f220681d) : 0;
            if ((this.f220680c & 2) == 2) {
                iO += f.o(2, this.f220682e);
            }
            int size = iO + this.f220679b.size();
            this.f220684g = size;
            return size;
        }

        @Override // bt.i, bt.q
        public s<b> j() {
            return f220678j;
        }

        @Override // bt.q
        public void m(f fVar) throws IOException {
            e();
            if ((this.f220680c & 1) == 1) {
                fVar.a0(1, this.f220681d);
            }
            if ((this.f220680c & 2) == 2) {
                fVar.a0(2, this.f220682e);
            }
            fVar.i0(this.f220679b);
        }

        private b(i.b bVar) {
            super(bVar);
            this.f220683f = (byte) -1;
            this.f220684g = -1;
            this.f220679b = bVar.p();
        }

        private b(boolean z15) {
            this.f220683f = (byte) -1;
            this.f220684g = -1;
            this.f220679b = bt.d.f21388a;
        }

        private b(bt.e eVar, g gVar) {
            this.f220683f = (byte) -1;
            this.f220684g = -1;
            E();
            bt.d.b bVarU = bt.d.u();
            f fVarJ = f.J(bVarU, 1);
            boolean z15 = false;
            while (!z15) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f220680c |= 1;
                                this.f220681d = eVar.s();
                            } else if (iK != 16) {
                                if (!r(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                this.f220680c |= 2;
                                this.f220682e = eVar.s();
                            }
                        }
                        z15 = true;
                    } catch (Throwable th4) {
                        try {
                            fVarJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f220679b = bVarU.r();
                        }
                        n();
                        throw th4;
                    }
                } catch (k e15) {
                    throw e15.i(this);
                } catch (IOException e16) {
                    throw new k(e16.getMessage()).i(this);
                }
            }
            try {
                fVarJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f220679b = bVarU.r();
            }
            n();
        }
    }

    public static final class c extends i implements bt.r {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final c f220688h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static s<c> f220689j = new C5904a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bt.d f220690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f220691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f220692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f220693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f220694f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f220695g;

        /* JADX INFO: renamed from: xs.a$c$a, reason: collision with other inner class name */
        static class C5904a extends bt.b<c> {
            C5904a() {
            }

            @Override // bt.s
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public c b(bt.e eVar, g gVar) {
                return new c(eVar, gVar);
            }
        }

        public static final class b extends i.b<c, b> implements bt.r {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f220696b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f220697c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f220698d;

            private b() {
                z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b y() {
                return new b();
            }

            private void z() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // bt.a.AbstractC0557a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b l(bt.e eVar, g gVar) throws Throwable {
                c cVar = null;
                try {
                    try {
                        c cVarB = c.f220689j.b(eVar, gVar);
                        if (cVarB != null) {
                            q(cVarB);
                        }
                        return this;
                    } catch (k e15) {
                        c cVar2 = (c) e15.a();
                        try {
                            throw e15;
                        } catch (Throwable th4) {
                            th = th4;
                            cVar = cVar2;
                            if (cVar != null) {
                                q(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (cVar != null) {
                        q(cVar);
                    }
                    throw th;
                }
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b q(c cVar) {
                if (cVar == c.y()) {
                    return this;
                }
                if (cVar.D()) {
                    G(cVar.B());
                }
                if (cVar.C()) {
                    F(cVar.A());
                }
                s(p().f(cVar.f220690b));
                return this;
            }

            public b F(int i15) {
                this.f220696b |= 2;
                this.f220698d = i15;
                return this;
            }

            public b G(int i15) {
                this.f220696b |= 1;
                this.f220697c = i15;
                return this;
            }

            @Override // bt.q.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public c build() {
                c cVarW = w();
                if (cVarW.c()) {
                    return cVarW;
                }
                throw bt.a.AbstractC0557a.n(cVarW);
            }

            public c w() {
                c cVar = new c(this);
                int i15 = this.f220696b;
                int i16 = (i15 & 1) != 1 ? 0 : 1;
                cVar.f220692d = this.f220697c;
                if ((i15 & 2) == 2) {
                    i16 |= 2;
                }
                cVar.f220693e = this.f220698d;
                cVar.f220691c = i16;
                return cVar;
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b o() {
                return y().q(w());
            }
        }

        static {
            c cVar = new c(true);
            f220688h = cVar;
            cVar.E();
        }

        private void E() {
            this.f220692d = 0;
            this.f220693e = 0;
        }

        public static b F() {
            return b.y();
        }

        public static b G(c cVar) {
            return F().q(cVar);
        }

        public static c y() {
            return f220688h;
        }

        public int A() {
            return this.f220693e;
        }

        public int B() {
            return this.f220692d;
        }

        public boolean C() {
            return (this.f220691c & 2) == 2;
        }

        public boolean D() {
            return (this.f220691c & 1) == 1;
        }

        @Override // bt.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public b g() {
            return F();
        }

        @Override // bt.q
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public b b() {
            return G(this);
        }

        @Override // bt.r
        public final boolean c() {
            byte b15 = this.f220694f;
            if (b15 == 1) {
                return true;
            }
            if (b15 == 0) {
                return false;
            }
            this.f220694f = (byte) 1;
            return true;
        }

        @Override // bt.q
        public int e() {
            int i15 = this.f220695g;
            if (i15 != -1) {
                return i15;
            }
            int iO = (this.f220691c & 1) == 1 ? f.o(1, this.f220692d) : 0;
            if ((this.f220691c & 2) == 2) {
                iO += f.o(2, this.f220693e);
            }
            int size = iO + this.f220690b.size();
            this.f220695g = size;
            return size;
        }

        @Override // bt.i, bt.q
        public s<c> j() {
            return f220689j;
        }

        @Override // bt.q
        public void m(f fVar) throws IOException {
            e();
            if ((this.f220691c & 1) == 1) {
                fVar.a0(1, this.f220692d);
            }
            if ((this.f220691c & 2) == 2) {
                fVar.a0(2, this.f220693e);
            }
            fVar.i0(this.f220690b);
        }

        private c(i.b bVar) {
            super(bVar);
            this.f220694f = (byte) -1;
            this.f220695g = -1;
            this.f220690b = bVar.p();
        }

        private c(boolean z15) {
            this.f220694f = (byte) -1;
            this.f220695g = -1;
            this.f220690b = bt.d.f21388a;
        }

        private c(bt.e eVar, g gVar) {
            this.f220694f = (byte) -1;
            this.f220695g = -1;
            E();
            bt.d.b bVarU = bt.d.u();
            f fVarJ = f.J(bVarU, 1);
            boolean z15 = false;
            while (!z15) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f220691c |= 1;
                                this.f220692d = eVar.s();
                            } else if (iK != 16) {
                                if (!r(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                this.f220691c |= 2;
                                this.f220693e = eVar.s();
                            }
                        }
                        z15 = true;
                    } catch (Throwable th4) {
                        try {
                            fVarJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f220690b = bVarU.r();
                        }
                        n();
                        throw th4;
                    }
                } catch (k e15) {
                    throw e15.i(this);
                } catch (IOException e16) {
                    throw new k(e16.getMessage()).i(this);
                }
            }
            try {
                fVarJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f220690b = bVarU.r();
            }
            n();
        }
    }

    public static final class d extends i implements bt.r {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final d f220699l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static s<d> f220700m = new C5905a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bt.d f220701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f220702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b f220703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f220704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f220705f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f220706g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private c f220707h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f220708j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f220709k;

        /* JADX INFO: renamed from: xs.a$d$a, reason: collision with other inner class name */
        static class C5905a extends bt.b<d> {
            C5905a() {
            }

            @Override // bt.s
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public d b(bt.e eVar, g gVar) {
                return new d(eVar, gVar);
            }
        }

        public static final class b extends i.b<d, b> implements bt.r {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f220710b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private b f220711c = b.y();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private c f220712d = c.y();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private c f220713e = c.y();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private c f220714f = c.y();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private c f220715g = c.y();

            private b() {
                z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b y() {
                return new b();
            }

            private void z() {
            }

            public b A(c cVar) {
                if ((this.f220710b & 16) != 16 || this.f220715g == c.y()) {
                    this.f220715g = cVar;
                } else {
                    this.f220715g = c.G(this.f220715g).q(cVar).w();
                }
                this.f220710b |= 16;
                return this;
            }

            public b D(b bVar) {
                if ((this.f220710b & 1) != 1 || this.f220711c == b.y()) {
                    this.f220711c = bVar;
                } else {
                    this.f220711c = b.G(this.f220711c).q(bVar).w();
                }
                this.f220710b |= 1;
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // bt.a.AbstractC0557a
            /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
            public b l(bt.e eVar, g gVar) throws Throwable {
                d dVar = null;
                try {
                    try {
                        d dVarB = d.f220700m.b(eVar, gVar);
                        if (dVarB != null) {
                            q(dVarB);
                        }
                        return this;
                    } catch (k e15) {
                        d dVar2 = (d) e15.a();
                        try {
                            throw e15;
                        } catch (Throwable th4) {
                            th = th4;
                            dVar = dVar2;
                            if (dVar != null) {
                                q(dVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (dVar != null) {
                        q(dVar);
                    }
                    throw th;
                }
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
            public b q(d dVar) {
                if (dVar == d.C()) {
                    return this;
                }
                if (dVar.J()) {
                    D(dVar.E());
                }
                if (dVar.M()) {
                    J(dVar.H());
                }
                if (dVar.K()) {
                    H(dVar.F());
                }
                if (dVar.L()) {
                    I(dVar.G());
                }
                if (dVar.I()) {
                    A(dVar.D());
                }
                s(p().f(dVar.f220701b));
                return this;
            }

            public b H(c cVar) {
                if ((this.f220710b & 4) != 4 || this.f220713e == c.y()) {
                    this.f220713e = cVar;
                } else {
                    this.f220713e = c.G(this.f220713e).q(cVar).w();
                }
                this.f220710b |= 4;
                return this;
            }

            public b I(c cVar) {
                if ((this.f220710b & 8) != 8 || this.f220714f == c.y()) {
                    this.f220714f = cVar;
                } else {
                    this.f220714f = c.G(this.f220714f).q(cVar).w();
                }
                this.f220710b |= 8;
                return this;
            }

            public b J(c cVar) {
                if ((this.f220710b & 2) != 2 || this.f220712d == c.y()) {
                    this.f220712d = cVar;
                } else {
                    this.f220712d = c.G(this.f220712d).q(cVar).w();
                }
                this.f220710b |= 2;
                return this;
            }

            @Override // bt.q.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public d build() {
                d dVarW = w();
                if (dVarW.c()) {
                    return dVarW;
                }
                throw bt.a.AbstractC0557a.n(dVarW);
            }

            public d w() {
                d dVar = new d(this);
                int i15 = this.f220710b;
                int i16 = (i15 & 1) != 1 ? 0 : 1;
                dVar.f220703d = this.f220711c;
                if ((i15 & 2) == 2) {
                    i16 |= 2;
                }
                dVar.f220704e = this.f220712d;
                if ((i15 & 4) == 4) {
                    i16 |= 4;
                }
                dVar.f220705f = this.f220713e;
                if ((i15 & 8) == 8) {
                    i16 |= 8;
                }
                dVar.f220706g = this.f220714f;
                if ((i15 & 16) == 16) {
                    i16 |= 16;
                }
                dVar.f220707h = this.f220715g;
                dVar.f220702c = i16;
                return dVar;
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b o() {
                return y().q(w());
            }
        }

        static {
            d dVar = new d(true);
            f220699l = dVar;
            dVar.N();
        }

        public static d C() {
            return f220699l;
        }

        private void N() {
            this.f220703d = b.y();
            this.f220704e = c.y();
            this.f220705f = c.y();
            this.f220706g = c.y();
            this.f220707h = c.y();
        }

        public static b O() {
            return b.y();
        }

        public static b Q(d dVar) {
            return O().q(dVar);
        }

        public c D() {
            return this.f220707h;
        }

        public b E() {
            return this.f220703d;
        }

        public c F() {
            return this.f220705f;
        }

        public c G() {
            return this.f220706g;
        }

        public c H() {
            return this.f220704e;
        }

        public boolean I() {
            return (this.f220702c & 16) == 16;
        }

        public boolean J() {
            return (this.f220702c & 1) == 1;
        }

        public boolean K() {
            return (this.f220702c & 4) == 4;
        }

        public boolean L() {
            return (this.f220702c & 8) == 8;
        }

        public boolean M() {
            return (this.f220702c & 2) == 2;
        }

        @Override // bt.q
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public b g() {
            return O();
        }

        @Override // bt.q
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public b b() {
            return Q(this);
        }

        @Override // bt.r
        public final boolean c() {
            byte b15 = this.f220708j;
            if (b15 == 1) {
                return true;
            }
            if (b15 == 0) {
                return false;
            }
            this.f220708j = (byte) 1;
            return true;
        }

        @Override // bt.q
        public int e() {
            int i15 = this.f220709k;
            if (i15 != -1) {
                return i15;
            }
            int iS = (this.f220702c & 1) == 1 ? f.s(1, this.f220703d) : 0;
            if ((this.f220702c & 2) == 2) {
                iS += f.s(2, this.f220704e);
            }
            if ((this.f220702c & 4) == 4) {
                iS += f.s(3, this.f220705f);
            }
            if ((this.f220702c & 8) == 8) {
                iS += f.s(4, this.f220706g);
            }
            if ((this.f220702c & 16) == 16) {
                iS += f.s(5, this.f220707h);
            }
            int size = iS + this.f220701b.size();
            this.f220709k = size;
            return size;
        }

        @Override // bt.i, bt.q
        public s<d> j() {
            return f220700m;
        }

        @Override // bt.q
        public void m(f fVar) throws IOException {
            e();
            if ((this.f220702c & 1) == 1) {
                fVar.d0(1, this.f220703d);
            }
            if ((this.f220702c & 2) == 2) {
                fVar.d0(2, this.f220704e);
            }
            if ((this.f220702c & 4) == 4) {
                fVar.d0(3, this.f220705f);
            }
            if ((this.f220702c & 8) == 8) {
                fVar.d0(4, this.f220706g);
            }
            if ((this.f220702c & 16) == 16) {
                fVar.d0(5, this.f220707h);
            }
            fVar.i0(this.f220701b);
        }

        private d(i.b bVar) {
            super(bVar);
            this.f220708j = (byte) -1;
            this.f220709k = -1;
            this.f220701b = bVar.p();
        }

        private d(boolean z15) {
            this.f220708j = (byte) -1;
            this.f220709k = -1;
            this.f220701b = bt.d.f21388a;
        }

        private d(bt.e eVar, g gVar) {
            this.f220708j = (byte) -1;
            this.f220709k = -1;
            N();
            bt.d.b bVarU = bt.d.u();
            f fVarJ = f.J(bVarU, 1);
            boolean z15 = false;
            while (!z15) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                b.C5903b c5903bB = (this.f220702c & 1) == 1 ? this.f220703d.b() : null;
                                b bVar = (b) eVar.u(b.f220678j, gVar);
                                this.f220703d = bVar;
                                if (c5903bB != null) {
                                    c5903bB.q(bVar);
                                    this.f220703d = c5903bB.w();
                                }
                                this.f220702c |= 1;
                            } else if (iK == 18) {
                                c.b bVarB = (this.f220702c & 2) == 2 ? this.f220704e.b() : null;
                                c cVar = (c) eVar.u(c.f220689j, gVar);
                                this.f220704e = cVar;
                                if (bVarB != null) {
                                    bVarB.q(cVar);
                                    this.f220704e = bVarB.w();
                                }
                                this.f220702c |= 2;
                            } else if (iK == 26) {
                                c.b bVarB2 = (this.f220702c & 4) == 4 ? this.f220705f.b() : null;
                                c cVar2 = (c) eVar.u(c.f220689j, gVar);
                                this.f220705f = cVar2;
                                if (bVarB2 != null) {
                                    bVarB2.q(cVar2);
                                    this.f220705f = bVarB2.w();
                                }
                                this.f220702c |= 4;
                            } else if (iK == 34) {
                                c.b bVarB3 = (this.f220702c & 8) == 8 ? this.f220706g.b() : null;
                                c cVar3 = (c) eVar.u(c.f220689j, gVar);
                                this.f220706g = cVar3;
                                if (bVarB3 != null) {
                                    bVarB3.q(cVar3);
                                    this.f220706g = bVarB3.w();
                                }
                                this.f220702c |= 8;
                            } else if (iK != 42) {
                                if (!r(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                c.b bVarB4 = (this.f220702c & 16) == 16 ? this.f220707h.b() : null;
                                c cVar4 = (c) eVar.u(c.f220689j, gVar);
                                this.f220707h = cVar4;
                                if (bVarB4 != null) {
                                    bVarB4.q(cVar4);
                                    this.f220707h = bVarB4.w();
                                }
                                this.f220702c |= 16;
                            }
                        }
                        z15 = true;
                    } catch (Throwable th4) {
                        try {
                            fVarJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f220701b = bVarU.r();
                        }
                        n();
                        throw th4;
                    }
                } catch (k e15) {
                    throw e15.i(this);
                } catch (IOException e16) {
                    throw new k(e16.getMessage()).i(this);
                }
            }
            try {
                fVarJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f220701b = bVarU.r();
            }
            n();
        }
    }
}
