package ha0;

import aa0.AddDocumentsEntryData;
import da0.AvailableDocument;
import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BC\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lha0/s;", "Ll00/g;", "Lha0/e;", "", "Lha0/f;", "Lyy/a;", "stateMachineFactory", "Lga0/d;", "addDocumentMapper", "Lga0/b;", "addDocumentErrorMapper", "Ldf0/m;", "requestDocumentDownloadUC", "Lac4/a;", "callWithActionWithLoaderUseCase", "Lhb4/d;", "errorVMSFactory", "Laa0/a;", "setupData", "<init>", "(Lyy/a;Lga0/d;Lga0/b;Ldf0/m;Lac4/a;Lhb4/d;Laa0/a;)V", "state", "Lha0/f$a;", "r9", "(Lha0/e;)Lha0/f$a;", "Ldx/b;", "Ljb4/b;", "t9", "(Ldx/b;)Ljb4/b;", "b", "Lga0/d;", "c", "Lga0/b;", "d", "Ldf0/m;", "e", "Lac4/a;", "f", "Lhb4/d;", "g", "Laa0/a;", "Lha0/e$c;", "h", "Lha0/e$c;", "initialState", "Lxw/b;", "Lha0/c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<ha0.e, Object> implements ha0.f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ga0.d addDocumentMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ga0.b addDocumentErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final df0.m requestDocumentDownloadUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callWithActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AddDocumentsEntryData setupData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ha0.e.Initialized initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ha0.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ha0.e, Object> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<ha0.f.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82312a;

        static {
            int[] iArr = new int[aa0.b.values().length];
            try {
                iArr[aa0.b.DRIVING_LICENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[aa0.b.FAMILY_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[aa0.b.SCHOOL_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[aa0.b.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[aa0.b.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f82312a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ha0.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f82313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f82314b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f82315a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f82316b;

            /* JADX INFO: renamed from: ha0.s$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1894a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f82317d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f82318e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f82319f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f82321h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f82322j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f82323k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f82324l;

                public C1894a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f82317d = obj;
                    this.f82318e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f82315a = hVar;
                this.f82316b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1894a c1894a;
                if (eVar instanceof C1894a) {
                    c1894a = (C1894a) eVar;
                    int i15 = c1894a.f82318e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1894a.f82318e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1894a = new C1894a(eVar);
                    }
                } else {
                    c1894a = new C1894a(eVar);
                }
                Object obj2 = c1894a.f82317d;
                Object objE = uq.b.e();
                int i16 = c1894a.f82318e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f82315a;
                    ha0.f.a aVarR9 = this.f82316b.r9((ha0.e) obj);
                    c1894a.f82319f = vq.j.a(obj);
                    c1894a.f82321h = vq.j.a(c1894a);
                    c1894a.f82322j = vq.j.a(obj);
                    c1894a.f82323k = vq.j.a(hVar);
                    c1894a.f82324l = 0;
                    c1894a.f82318e = 1;
                    if (hVar.F(aVarR9, c1894a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, s sVar) {
            this.f82313a = gVar;
            this.f82314b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ha0.f.a> hVar, tq.e eVar) {
            Object objA = this.f82313a.a(new a(hVar, this.f82314b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lha0/b;", "<unused var>", "Lha0/e;", "Loq/i0;", "<anonymous>", "(Lha0/b;Lha0/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ha0.b, ha0.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82325e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f82325e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ha0.c> bVarY1 = s.this.Y1();
                ha0.c.a aVar = ha0.c.a.f82278a;
                this.f82325e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ha0.b bVar, ha0.e eVar, tq.e<? super i0> eVar2) {
            return s.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lha0/d;", "action", "Lk10/c0;", "Lha0/e$c;", "state", "Lk10/l;", "Lha0/e;", "<anonymous>", "(Lha0/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnCheckDocument, c0<ha0.e.Initialized>, tq.e<? super k10.l<? extends ha0.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82328f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f82329g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ha0.e.Initialized O(OnCheckDocument onCheckDocument, ha0.e.Initialized initialized) {
            List<AvailableDocument> listB = initialized.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            for (AvailableDocument availableDocumentB : listB) {
                boolean z15 = availableDocumentB.getDocumentType() == onCheckDocument.getAvailableDocument().getDocumentType();
                if (z15) {
                    availableDocumentB = AvailableDocument.b(availableDocumentB, null, !availableDocumentB.getIsCheck(), 1, null);
                } else if (z15) {
                    throw new oq.p();
                }
                arrayList.add(availableDocumentB);
            }
            return initialized.a(arrayList);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCheckDocument onCheckDocument = (OnCheckDocument) this.f82328f;
            c0 c0Var = (c0) this.f82329g;
            uq.b.e();
            if (this.f82327e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ha0.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.d.O(onCheckDocument, (e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCheckDocument onCheckDocument, c0<ha0.e.Initialized> c0Var, tq.e<? super k10.l<? extends ha0.e>> eVar) {
            d dVar = new d(eVar);
            dVar.f82328f = onCheckDocument;
            dVar.f82329g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lha0/a;", "<unused var>", "Lk10/c0;", "Lha0/e$c;", "state", "Lk10/l;", "Lha0/e;", "<anonymous>", "(Lha0/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ha0.a, c0<ha0.e.Initialized>, tq.e<? super k10.l<? extends ha0.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82331f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ha0.e.AddDocument O(c0 c0Var, ha0.e.Initialized initialized) {
            return new ha0.e.AddDocument(((ha0.e.Initialized) c0Var.a()).b());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f82331f;
            uq.b.e();
            if (this.f82330e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ha0.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O(c0Var, (e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ha0.a aVar, c0<ha0.e.Initialized> c0Var, tq.e<? super k10.l<? extends ha0.e>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f82331f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lha0/e$a;", "state", "Lk10/l;", "Lha0/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<ha0.e.AddDocument>, tq.e<? super k10.l<? extends ha0.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82333f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lha0/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ha0.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f82335e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f82336f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f82337g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f82338h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f82339j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f82340k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ s f82341l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ c0<ha0.e.AddDocument> f82342m;

            /* JADX INFO: renamed from: ha0.s$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1895a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f82343a;

                static {
                    int[] iArr = new int[vf0.d.values().length];
                    try {
                        iArr[vf0.d.SCHOOL_CARD.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[vf0.d.DRIVING_LICENCE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[vf0.d.FAMILY_CARD.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[vf0.d.UUT_CARD.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f82343a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, c0<ha0.e.AddDocument> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f82341l = sVar;
                this.f82342m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ha0.e.Error V(s sVar, dx.b bVar, c0 c0Var, ha0.e.AddDocument addDocument) {
                return new ha0.e.Error(sVar.errorVMSFactory.a(sVar.t9(bVar)), ((ha0.e.AddDocument) c0Var.a()).a());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                cf0.c cVar;
                c0<ha0.e.AddDocument> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f82340k;
                if (i15 != 0) {
                    if (i15 == 1) {
                        oq.u.b(obj);
                    } else {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0Var = (c0) this.f82336f;
                        oq.u.b(obj);
                    }
                    return c0Var.c();
                }
                oq.u.b(obj);
                df0.m mVar = this.f82341l.requestDocumentDownloadUC;
                List<AvailableDocument> listA = this.f82342m.a().a();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listA) {
                    if (((AvailableDocument) obj2).getIsCheck()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i16 = C1895a.f82343a[((AvailableDocument) it.next()).getDocumentType().ordinal()];
                    if (i16 == 1) {
                        cVar = cf0.c.JUNIOR_STUDENT_CARD;
                    } else if (i16 == 2) {
                        cVar = cf0.c.DRIVING_LICENCE;
                    } else if (i16 == 3) {
                        cVar = cf0.c.FAMILY_CARD;
                    } else if (i16 == 4) {
                        cVar = cf0.c.UUT_CARD;
                    } else {
                        if (i16 != 5) {
                            throw new oq.p();
                        }
                        cVar = cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD;
                    }
                    arrayList2.add(cVar);
                }
                df0.m.Params params = new df0.m.Params(arrayList2);
                this.f82340k = 1;
                obj = mVar.c(params, this);
                if (obj != objE) {
                }
                return objE;
                dx.i iVar = (dx.i) obj;
                final c0<ha0.e.AddDocument> c0Var2 = this.f82342m;
                final s sVar = this.f82341l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: ha0.v
                        @Override // er.l
                        public final Object b(Object obj3) {
                            return s.f.a.V(sVar, bVar, c0Var2, (e.AddDocument) obj3);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                i0 i0Var = (i0) ((dx.i.Right) iVar).b();
                xw.b<ha0.c> bVarY1 = sVar.Y1();
                ha0.c.a aVar = ha0.c.a.f82278a;
                this.f82335e = vq.j.a(iVar);
                this.f82336f = c0Var2;
                this.f82337g = vq.j.a(i0Var);
                this.f82338h = 0;
                this.f82339j = 0;
                this.f82340k = 2;
                if (bVarY1.F(aVar, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f82341l, this.f82342m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ha0.e>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f82333f;
            Object objE = uq.b.e();
            int i15 = this.f82332e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = s.this.callWithActionWithLoaderUseCase;
            a aVar2 = new a(s.this, c0Var, null);
            this.f82333f = vq.j.a(c0Var);
            this.f82332e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<ha0.e.AddDocument> c0Var, tq.e<? super k10.l<? extends ha0.e>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = s.this.new f(eVar);
            fVar.f82333f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lha0/a;", "action", "Lk10/c0;", "Lha0/e$b;", "state", "Lk10/l;", "Lha0/e;", "<anonymous>", "(Lha0/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ha0.a, c0<ha0.e.Error>, tq.e<? super k10.l<? extends ha0.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82345f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ha0.e.AddDocument O(c0 c0Var, ha0.e.Error error) {
            return new ha0.e.AddDocument(((ha0.e.Error) c0Var.a()).a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f82345f;
            uq.b.e();
            if (this.f82344e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ha0.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.g.O(c0Var, (e.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ha0.a aVar, c0<ha0.e.Error> c0Var, tq.e<? super k10.l<? extends ha0.e>> eVar) {
            g gVar = new g(eVar);
            gVar.f82345f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, ga0.d dVar, ga0.b bVar, df0.m mVar, ac4.a aVar2, hb4.d dVar2, AddDocumentsEntryData addDocumentsEntryData) {
        vf0.d dVar3;
        this.addDocumentMapper = dVar;
        this.addDocumentErrorMapper = bVar;
        this.requestDocumentDownloadUC = mVar;
        this.callWithActionWithLoaderUseCase = aVar2;
        this.errorVMSFactory = dVar2;
        this.setupData = addDocumentsEntryData;
        List<aa0.b> listA = addDocumentsEntryData.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            int i15 = a.f82312a[((aa0.b) it.next()).ordinal()];
            if (i15 == 1) {
                dVar3 = vf0.d.DRIVING_LICENCE;
            } else if (i15 == 2) {
                dVar3 = vf0.d.FAMILY_CARD;
            } else if (i15 == 3) {
                dVar3 = vf0.d.SCHOOL_CARD;
            } else if (i15 == 4) {
                dVar3 = vf0.d.UUT_CARD;
            } else {
                if (i15 != 5) {
                    throw new oq.p();
                }
                dVar3 = vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD;
            }
            arrayList.add(new AvailableDocument(dVar3, false));
        }
        ha0.e.Initialized initialized = new ha0.e.Initialized(arrayList);
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: ha0.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.v9(this.f82301a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), r9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ha0.f.a r9(ha0.e state) {
        return this.addDocumentMapper.b(new ga0.d.Params(state, new er.l() { // from class: ha0.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.s9(this.f82298a, (AvailableDocument) obj);
            }
        }, b9(ha0.a.f82276a), b9(ha0.b.f82277a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(s sVar, AvailableDocument availableDocument) {
        sVar.d9(new OnCheckDocument(availableDocument));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b t9(dx.b bVar) {
        return this.addDocumentErrorMapper.b(new ga0.b.Params(bVar, b9(ha0.b.f82277a), b9(ha0.a.f82276a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(ha0.e.class), new er.l() { // from class: ha0.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.w9(this.f82299a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ha0.e.Initialized.class), new er.l() { // from class: ha0.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.x9((k10.z) obj);
            }
        });
        vVar.c(q0.c(ha0.e.AddDocument.class), new er.l() { // from class: ha0.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.y9(this.f82300a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ha0.e.Error.class), new er.l() { // from class: ha0.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.z9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(s sVar, k10.z zVar) {
        c cVar = sVar.new c(null);
        zVar.x(q0.c(ha0.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(k10.z zVar) {
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnCheckDocument.class), oVar, dVar);
        zVar.v(q0.c(ha0.a.class), oVar, new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(s sVar, k10.z zVar) {
        zVar.A(sVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(k10.z zVar) {
        g gVar = new g(null);
        zVar.v(q0.c(ha0.a.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ha0.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ha0.e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ha0.f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(AddDocumentsEntryData addDocumentsEntryData) {
        super.P5(addDocumentsEntryData);
    }
}
