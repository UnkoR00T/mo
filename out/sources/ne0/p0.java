package ne0;

import android.graphics.Bitmap;
import cb4.DialogData;
import ie0.UutCardDocument;
import java.time.OffsetDateTime;
import me0.UutCardBottomSheetData;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0001dB{\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\b\b\u0001\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020+H\u0096\u0001¢\u0006\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010T\u001a\b\u0012\u0004\u0012\u00020O0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR,\u0010Z\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040U8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010%\u001a\b\u0012\u0004\u0012\u00020&0[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020a0`8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010b¨\u0006e"}, d2 = {"Lne0/p0;", "Ll00/g;", "Ln20/b;", "Lne0/p;", "Ln20/a;", "Lne0/q;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lhe0/a;", "uutCardDataStorageInteractor", "Lle0/i;", "verificationDataMapper", "Lb00/c;", "imageConverter", "Lle0/h;", "mapper", "Lo20/t2$a;", "deps", "Lje0/a;", "getUutCardUC", "Lhb4/d;", "errorVMSFactory", "Lcb4/j;", "dialogVmsFactory", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "snackBarManagerStateHolder", "Lne0/p0$a$a;", "setupData", "<init>", "(Ln20/j;Lac4/a;Lhe0/a;Lle0/i;Lb00/c;Lle0/h;Lo20/t2$a;Lje0/a;Lhb4/d;Lcb4/j;Lmx/c;Lib4/c;Li70/n;Lne0/p0$a$a;)V", "state", "Lne0/q$a;", "D9", "(Ln20/b;)Lne0/q$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lac4/a;", "c", "Lhe0/a;", "d", "Lle0/i;", "e", "Lb00/c;", "f", "Lle0/h;", "g", "Lo20/t2$a;", "h", "Lje0/a;", "j", "Lhb4/d;", "k", "Lcb4/j;", "l", "Lmx/c;", "m", "Lib4/c;", "n", "Li70/n;", "p", "Lne0/p0$a$a;", "Lne0/p$c;", "q", "Lne0/p$c;", "initialState", "Lxw/b;", "Lne0/j;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "a", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 extends l00.g<State<ne0.p>, n20.a> implements ne0.q, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final he0.a uutCardDataStorageInteractor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final le0.i verificationDataMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final le0.h mapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final je0.a getUutCardUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVmsFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ne0.p.Initial initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ne0.j> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<ne0.p>, n20.a> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ne0.q.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lne0/p0$a;", "Lf00/j0;", "Lne0/p0$a$a;", "Lne0/p0;", "a", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<SetupData, p0> {

        /* JADX INFO: renamed from: ne0.p0$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lne0/p0$a$a;", "", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            public SetupData(String str) {
                this.documentId = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupData) && fr.t.c(this.documentId, ((SetupData) other).documentId);
            }

            public int hashCode() {
                String str = this.documentId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetupData(documentId=" + this.documentId + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ne0.q.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f134943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f134944b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f134945a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f134946b;

            /* JADX INFO: renamed from: ne0.p0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3341a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f134947d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f134948e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f134949f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f134951h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f134952j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f134953k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f134954l;

                public C3341a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f134947d = obj;
                    this.f134948e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p0 p0Var) {
                this.f134945a = hVar;
                this.f134946b = p0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3341a c3341a;
                if (eVar instanceof C3341a) {
                    c3341a = (C3341a) eVar;
                    int i15 = c3341a.f134948e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3341a.f134948e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3341a = new C3341a(eVar);
                    }
                } else {
                    c3341a = new C3341a(eVar);
                }
                Object obj2 = c3341a.f134947d;
                Object objE = uq.b.e();
                int i16 = c3341a.f134948e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f134945a;
                    ne0.q.a aVarD9 = this.f134946b.D9((State) obj);
                    c3341a.f134949f = vq.j.a(obj);
                    c3341a.f134951h = vq.j.a(c3341a);
                    c3341a.f134952j = vq.j.a(obj);
                    c3341a.f134953k = vq.j.a(hVar);
                    c3341a.f134954l = 0;
                    c3341a.f134948e = 1;
                    if (hVar.F(aVarD9, c3341a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, p0 p0Var) {
            this.f134943a = gVar;
            this.f134944b = p0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ne0.q.a> hVar, tq.e eVar) {
            Object objA = this.f134943a.a(new a(hVar, this.f134944b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lne0/p$c;", "state", "Loq/i0;", "<anonymous>", "(Lne0/p$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<ne0.p.Initial, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134956f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ne0.p.Initial initial = (ne0.p.Initial) this.f134956f;
            uq.b.e();
            if (this.f134955e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String documentId = initial.getDocumentId();
            if (documentId != null) {
                p0.this.d9(new LoadDocumentData(documentId));
            } else {
                p0.this.d9(ne0.l.f134897a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ne0.p.Initial initial, tq.e<? super oq.i0> eVar) {
            return ((c) v(initial, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = p0.this.new c(eVar);
            cVar.f134956f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/i;", "action", "Lk10/c0;", "Lne0/p$c;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<LoadDocumentData, k10.c0<ne0.p.Initial>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134960g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k10.z<ne0.p.Initial, ne0.p, n20.a> f134962j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lne0/p;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ne0.p>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f134963e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f134964f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f134965g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f134966h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f134967j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f134968k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f134969l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f134970m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f134971n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f134972p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f134973q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ p0 f134974r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ LoadDocumentData f134975s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ k10.c0<ne0.p.Initial> f134976t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ k10.z<ne0.p.Initial, ne0.p, n20.a> f134977v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, LoadDocumentData loadDocumentData, k10.c0<ne0.p.Initial> c0Var, k10.z<ne0.p.Initial, ne0.p, n20.a> zVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f134974r = p0Var;
                this.f134975s = loadDocumentData;
                this.f134976t = c0Var;
                this.f134977v = zVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ne0.p.Initialized V(LoadDocumentData loadDocumentData, Bitmap bitmap, je0.a.UutCardData uutCardData, ne0.p.Initial initial) {
                return new ne0.p.Initialized(loadDocumentData.getDocumentId(), bitmap, uutCardData.getPhotoData(), uutCardData.a(), uutCardData.getOwnerCard(), uutCardData.getOwnerCard(), y30.n.Switch.EnumC5973b.LEFT, null, null, null, 896, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objD;
                p0 p0Var;
                final LoadDocumentData loadDocumentData;
                k10.c0<ne0.p.Initial> c0Var;
                Object objB;
                k10.c0<ne0.p.Initial> c0Var2;
                final je0.a.UutCardData uutCardData;
                final Bitmap bitmap;
                Object objD2;
                Object objE = uq.b.e();
                int i15 = this.f134973q;
                if (i15 == 0) {
                    oq.u.b(obj);
                    je0.a aVar = this.f134974r.getUutCardUC;
                    je0.a.Params params = new je0.a.Params(this.f134975s.getDocumentId());
                    this.f134973q = 1;
                    objD = aVar.d(params, this);
                    if (objD != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                    objD = obj;
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uutCardData = (je0.a.UutCardData) this.f134968k;
                    LoadDocumentData loadDocumentData2 = (LoadDocumentData) this.f134967j;
                    c0Var2 = (k10.c0) this.f134966h;
                    p0Var = (p0) this.f134965g;
                    oq.u.b(obj);
                    loadDocumentData = loadDocumentData2;
                    objB = obj;
                }
                bitmap = (Bitmap) ((dx.i) objB).a();
                if (bitmap == null && (objD2 = c0Var2.d(new er.l() { // from class: ne0.q0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p0.d.a.V(loadDocumentData, bitmap, uutCardData, (p.Initial) obj2);
                    }
                })) != null) {
                    return objD2;
                }
                c0Var = c0Var2;
                p0Var.d9(new ShowLoadingError(loadDocumentData.getDocumentId(), new dx.b.Business(me0.e.READ_DOCUMENT_DATA_ERROR, null, p0Var.labelProvider.c(ge0.a.B), p0Var.labelProvider.c(ge0.a.A), null, p0Var.labelProvider.c(ge0.a.f72027b), null, 82, null)));
                return c0Var.c();
                dx.i iVar = (dx.i) objD;
                p0Var = this.f134974r;
                loadDocumentData = this.f134975s;
                c0Var = this.f134976t;
                k10.z<ne0.p.Initial, ne0.p, n20.a> zVar = this.f134977v;
                if (iVar instanceof dx.i.Left) {
                    p0Var.d9(new ShowLoadingError(loadDocumentData.getDocumentId(), (dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                je0.a.UutCardData uutCardData2 = (je0.a.UutCardData) ((dx.i.Right) iVar).b();
                String photo = uutCardData2.getPhotoData().getPhoto();
                if (photo != null) {
                    b00.c cVar = p0Var.imageConverter;
                    this.f134963e = vq.j.a(iVar);
                    this.f134964f = zVar;
                    this.f134965g = p0Var;
                    this.f134966h = c0Var;
                    this.f134967j = loadDocumentData;
                    this.f134968k = uutCardData2;
                    this.f134969l = vq.j.a(photo);
                    this.f134970m = 0;
                    this.f134971n = 0;
                    this.f134972p = 0;
                    this.f134973q = 2;
                    objB = cVar.b(photo, this);
                    if (objB != objE) {
                        c0Var2 = c0Var;
                        uutCardData = uutCardData2;
                        bitmap = (Bitmap) ((dx.i) objB).a();
                        if (bitmap == null) {
                        }
                        c0Var = c0Var2;
                    }
                    return objE;
                }
                p0Var.d9(new ShowLoadingError(loadDocumentData.getDocumentId(), new dx.b.Business(me0.e.READ_DOCUMENT_DATA_ERROR, null, p0Var.labelProvider.c(ge0.a.B), p0Var.labelProvider.c(ge0.a.A), null, p0Var.labelProvider.c(ge0.a.f72027b), null, 82, null)));
                return c0Var.c();
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f134974r, this.f134975s, this.f134976t, this.f134977v, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ne0.p>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k10.z<ne0.p.Initial, ne0.p, n20.a> zVar, tq.e<? super d> eVar) {
            super(3, eVar);
            this.f134962j = zVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            LoadDocumentData loadDocumentData = (LoadDocumentData) this.f134959f;
            k10.c0 c0Var = (k10.c0) this.f134960g;
            Object objE = uq.b.e();
            int i15 = this.f134958e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p0.this, loadDocumentData, c0Var, this.f134962j, null);
            this.f134959f = vq.j.a(loadDocumentData);
            this.f134960g = vq.j.a(c0Var);
            this.f134958e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(LoadDocumentData loadDocumentData, k10.c0<ne0.p.Initial> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            d dVar = p0.this.new d(this.f134962j, eVar);
            dVar.f134959f = loadDocumentData;
            dVar.f134960g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/l;", "action", "Lk10/c0;", "Lne0/p$c;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ne0.l, k10.c0<ne0.p.Initial>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134979f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.b.InitialError V(final p0 p0Var, ne0.p.Initial initial) {
            return new ne0.p.b.InitialError(p0Var.errorVMSFactory.a(p0Var.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: ne0.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.e.X(p0Var, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(p0 p0Var, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                p0Var.d9(ne0.d.f134869a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f134979f;
            uq.b.e();
            if (this.f134978e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: ne0.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.e.V(p0Var, (p.Initial) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ne0.l lVar, k10.c0<ne0.p.Initial> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            e eVar2 = p0.this.new e(eVar);
            eVar2.f134979f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/m;", "action", "Lk10/c0;", "Lne0/p$c;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ShowLoadingError, k10.c0<ne0.p.Initial>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134982f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134983g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.b.LoadingError V(ShowLoadingError showLoadingError, final p0 p0Var, ne0.p.Initial initial) {
            return new ne0.p.b.LoadingError(p0Var.errorVMSFactory.a(p0Var.genericDomainErrorMapper.b(new ib4.c.Params(showLoadingError.getDomainError(), false, new er.l() { // from class: ne0.u0
                @Override // er.l
                public final Object b(Object obj) {
                    return p0.f.X(p0Var, (ib4.c.b) obj);
                }
            }, 2, null))), showLoadingError.getDocumentId());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(p0 p0Var, ib4.c.b bVar) {
            if (bVar instanceof ib4.c.b.a.Close) {
                p0Var.d9(ne0.d.f134869a);
            } else if (bVar instanceof ib4.c.b.a.Primary) {
                p0Var.d9(ne0.g.f134879a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowLoadingError showLoadingError = (ShowLoadingError) this.f134982f;
            k10.c0 c0Var = (k10.c0) this.f134983g;
            uq.b.e();
            if (this.f134981e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: ne0.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.f.V(showLoadingError, p0Var, (p.Initial) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowLoadingError showLoadingError, k10.c0<ne0.p.Initial> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            f fVar = p0.this.new f(eVar);
            fVar.f134982f = showLoadingError;
            fVar.f134983g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/o;", "<unused var>", "Lk10/c0;", "Lne0/p$d;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ne0.o, k10.c0<ne0.p.Initialized>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134985e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134986f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.Updating O(k10.c0 c0Var, ne0.p.Initialized initialized) {
            return new ne0.p.Updating(((ne0.p.Initialized) c0Var.a()).getParentDocumentId(), ((ne0.p.Initialized) c0Var.a()).getDialogVMSAdapter());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f134986f;
            uq.b.e();
            if (this.f134985e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((ne0.p.Initialized) c0Var.a()).getSelectedCard().getScopeData().getHeader().b(OffsetDateTime.now())) {
                return c0Var.d(new er.l() { // from class: ne0.w0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p0.g.O(c0Var, (p.Initialized) obj2);
                    }
                });
            }
            p0.this.y(new p50.a.DefaultWithIcon(p0.this.labelProvider.c(ge0.a.f72031f), false, null, null, 14, null));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne0.o oVar, k10.c0<ne0.p.Initialized> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            g gVar = p0.this.new g(eVar);
            gVar.f134986f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/c;", "action", "Lk10/c0;", "Lne0/p$d;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ChangeSwitchItem, k10.c0<ne0.p.Initialized>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134990g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.Initialized O(ChangeSwitchItem changeSwitchItem, ne0.p.Initialized initialized) {
            return ne0.p.Initialized.c(initialized, null, null, null, null, null, null, changeSwitchItem.getNewItem(), null, null, null, 959, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeSwitchItem changeSwitchItem = (ChangeSwitchItem) this.f134989f;
            k10.c0 c0Var = (k10.c0) this.f134990g;
            uq.b.e();
            if (this.f134988e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ne0.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.h.O(changeSwitchItem, (p.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeSwitchItem changeSwitchItem, k10.c0<ne0.p.Initialized> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            h hVar = new h(eVar);
            hVar.f134989f = changeSwitchItem;
            hVar.f134990g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/b;", "action", "Lk10/c0;", "Lne0/p$d;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ChangeDocument, k10.c0<ne0.p.Initialized>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134993g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.Initialized O(ChangeDocument changeDocument, ne0.p.Initialized initialized) {
            return ne0.p.Initialized.c(initialized, null, null, null, null, null, changeDocument.getDocument(), null, null, null, null, 991, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeDocument changeDocument = (ChangeDocument) this.f134992f;
            k10.c0 c0Var = (k10.c0) this.f134993g;
            uq.b.e();
            if (this.f134991e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ne0.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.i.O(changeDocument, (p.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeDocument changeDocument, k10.c0<ne0.p.Initialized> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            i iVar = new i(eVar);
            iVar.f134992f = changeDocument;
            iVar.f134993g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/a;", "action", "Lk10/c0;", "Lne0/p$d;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ne0.a, k10.c0<ne0.p.Initialized>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134995f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.Initialized O(k10.c0 c0Var, ne0.p.Initialized initialized) {
            return ne0.p.Initialized.c(initialized, null, null, null, null, null, ((ne0.p.Initialized) c0Var.a()).getOwnCard(), null, null, null, null, 991, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f134995f;
            Object objE = uq.b.e();
            int i15 = this.f134994e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (((ne0.p.Initialized) c0Var.a()).getBottomSheetValue() != g30.v.HIDDEN) {
                    p0.this.d9(ne0.e.f134871a);
                    return c0Var.c();
                }
                boolean zQ = ((ne0.p.Initialized) c0Var.a()).getSelectedCard().getScopeData().getData().q();
                if (!zQ) {
                    if (zQ) {
                        throw new oq.p();
                    }
                    return c0Var.b(new er.l() { // from class: ne0.y0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p0.j.O(c0Var, (p.Initialized) obj2);
                        }
                    });
                }
                xw.b<ne0.j> bVarY1 = p0.this.Y1();
                ne0.j.a aVar = ne0.j.a.f134890a;
                this.f134995f = c0Var;
                this.f134994e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne0.a aVar, k10.c0<ne0.p.Initialized> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            j jVar = p0.this.new j(eVar);
            jVar.f134995f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/n;", "action", "Lk10/c0;", "Lne0/p$d;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ShowQrCode, k10.c0<ne0.p.Initialized>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134999g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.Initialized O(ShowQrCode showQrCode, ne0.p.Initialized initialized) {
            return ne0.p.Initialized.c(initialized, null, null, null, null, null, null, null, g30.v.EXPANDED, showQrCode.getData(), null, 639, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowQrCode showQrCode = (ShowQrCode) this.f134998f;
            k10.c0 c0Var = (k10.c0) this.f134999g;
            uq.b.e();
            if (this.f134997e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ne0.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.k.O(showQrCode, (p.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowQrCode showQrCode, k10.c0<ne0.p.Initialized> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            k kVar = new k(eVar);
            kVar.f134998f = showQrCode;
            kVar.f134999g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/e;", "action", "Lk10/c0;", "Lne0/p$d;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ne0.e, k10.c0<ne0.p.Initialized>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135001f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.Initialized O(ne0.p.Initialized initialized) {
            return ne0.p.Initialized.c(initialized, null, null, null, null, null, null, null, g30.v.HIDDEN, null, null, 895, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f135001f;
            uq.b.e();
            if (this.f135000e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ne0.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.l.O((p.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne0.e eVar, k10.c0<ne0.p.Initialized> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar2) {
            l lVar = new l(eVar2);
            lVar.f135001f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/g;", "<unused var>", "Lk10/c0;", "Lne0/p$d;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ne0.g, k10.c0<ne0.p.Initialized>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135002e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135003f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.DeleteDocument O(k10.c0 c0Var, ne0.p.Initialized initialized) {
            return new ne0.p.DeleteDocument(((ne0.p.Initialized) c0Var.a()).getParentDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f135003f;
            uq.b.e();
            if (this.f135002e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ne0.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.m.O(c0Var, (p.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne0.g gVar, k10.c0<ne0.p.Initialized> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            m mVar = new m(eVar);
            mVar.f135003f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/k;", "action", "Lk10/c0;", "Lne0/p$d;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ShowDialog, k10.c0<ne0.p.Initialized>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f135006g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.Initialized O(p0 p0Var, ShowDialog showDialog, ne0.p.Initialized initialized) {
            return ne0.p.Initialized.c(initialized, null, null, null, null, null, null, null, null, null, p0Var.dialogVmsFactory.a(showDialog.getDialog()), 511, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowDialog showDialog = (ShowDialog) this.f135005f;
            k10.c0 c0Var = (k10.c0) this.f135006g;
            uq.b.e();
            if (this.f135004e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: ne0.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.n.O(p0Var, showDialog, (p.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, k10.c0<ne0.p.Initialized> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            n nVar = p0.this.new n(eVar);
            nVar.f135005f = showDialog;
            nVar.f135006g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/f;", "action", "Lk10/c0;", "Lne0/p$d;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ne0.f, k10.c0<ne0.p.Initialized>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135009f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.Initialized O(ne0.p.Initialized initialized) {
            return ne0.p.Initialized.c(initialized, null, null, null, null, null, null, null, null, null, null, 511, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f135009f;
            uq.b.e();
            if (this.f135008e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ne0.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.o.O((p.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne0.f fVar, k10.c0<ne0.p.Initialized> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            o oVar = new o(eVar);
            oVar.f135009f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lne0/h;", "action", "Lne0/p$d;", "state", "Loq/i0;", "<anonymous>", "(Lne0/h;Lne0/p$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<GoToVerification, ne0.p.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135011f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ne0.p.Initialized initialized = (ne0.p.Initialized) this.f135011f;
            Object objE = uq.b.e();
            int i15 = this.f135010e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ne0.j> bVarY1 = p0.this.Y1();
                ne0.j.GoToVerification goToVerification = new ne0.j.GoToVerification(p0.this.verificationDataMapper.b(new le0.i.Params(initialized)));
                this.f135011f = vq.j.a(initialized);
                this.f135010e = 1;
                if (bVarY1.F(goToVerification, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(GoToVerification goToVerification, ne0.p.Initialized initialized, tq.e<? super oq.i0> eVar) {
            p pVar = p0.this.new p(eVar);
            pVar.f135011f = initialized;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lne0/p$e;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<k10.c0<ne0.p.Updating>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135014f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lne0/p;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ne0.p>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f135016e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f135017f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f135018g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f135019h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f135020j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f135021k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ p0 f135022l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<ne0.p.Updating> f135023m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, k10.c0<ne0.p.Updating> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f135022l = p0Var;
                this.f135023m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ne0.p.b.LoadingError X(k10.c0 c0Var, final p0 p0Var, dx.b bVar, ne0.p.Updating updating) {
                return new ne0.p.b.LoadingError(p0Var.errorVMSFactory.a(p0Var.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ne0.f1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p0.q.a.Y(p0Var, (ib4.c.b) obj);
                    }
                }, 2, null))), ((ne0.p.Updating) c0Var.a()).getDocumentId());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Y(p0 p0Var, ib4.c.b bVar) {
                if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                    p0Var.d9(ne0.o.f134906a);
                } else {
                    p0Var.d9(ne0.d.f134869a);
                }
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<ne0.p.Updating> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f135021k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    he0.a aVar = this.f135022l.uutCardDataStorageInteractor;
                    String documentId = this.f135023m.a().getDocumentId();
                    this.f135021k = 1;
                    obj = aVar.d(documentId, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f135017f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<ne0.p.Updating> c0Var2 = this.f135023m;
                final p0 p0Var = this.f135022l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: ne0.e1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p0.q.a.X(c0Var2, p0Var, bVar, (p.Updating) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                String str = (String) ((dx.i.Right) iVar).b();
                xw.b<ne0.j> bVarY1 = p0Var.Y1();
                ne0.j.ShowDocumentLoader showDocumentLoader = new ne0.j.ShowDocumentLoader(str);
                this.f135016e = vq.j.a(iVar);
                this.f135017f = c0Var2;
                this.f135018g = vq.j.a(str);
                this.f135019h = 0;
                this.f135020j = 0;
                this.f135021k = 2;
                if (bVarY1.F(showDocumentLoader, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f135022l, this.f135023m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ne0.p>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f135014f;
            Object objE = uq.b.e();
            int i15 = this.f135013e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p0.this, c0Var, null);
            this.f135014f = vq.j.a(c0Var);
            this.f135013e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ne0.p.Updating> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            return ((q) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            q qVar = p0.this.new q(eVar);
            qVar.f135014f = obj;
            return qVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lne0/p$a;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.p<k10.c0<ne0.p.DeleteDocument>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135025f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lne0/p;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ne0.p>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f135027e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f135028f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f135029g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f135030h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f135031j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f135032k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ p0 f135033l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<ne0.p.DeleteDocument> f135034m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, k10.c0<ne0.p.DeleteDocument> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f135033l = p0Var;
                this.f135034m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ne0.p.b.LoadingError X(k10.c0 c0Var, final p0 p0Var, dx.b bVar, ne0.p.DeleteDocument deleteDocument) {
                return new ne0.p.b.LoadingError(p0Var.errorVMSFactory.a(p0Var.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ne0.h1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p0.r.a.Y(p0Var, (ib4.c.b) obj);
                    }
                }, 2, null))), ((ne0.p.DeleteDocument) c0Var.a()).getDocumentId());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Y(p0 p0Var, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    p0Var.d9(ne0.d.f134869a);
                } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    p0Var.d9(ne0.g.f134879a);
                }
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<ne0.p.DeleteDocument> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f135032k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    he0.a aVar = this.f135033l.uutCardDataStorageInteractor;
                    String documentId = this.f135034m.a().getDocumentId();
                    this.f135032k = 1;
                    obj = aVar.b(documentId, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f135028f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<ne0.p.DeleteDocument> c0Var2 = this.f135034m;
                final p0 p0Var = this.f135033l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: ne0.g1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p0.r.a.X(c0Var2, p0Var, bVar, (p.DeleteDocument) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                xw.b<ne0.j> bVarY1 = p0Var.Y1();
                ne0.j.a aVar2 = ne0.j.a.f134890a;
                this.f135027e = vq.j.a(iVar);
                this.f135028f = c0Var2;
                this.f135029g = vq.j.a(i0Var);
                this.f135030h = 0;
                this.f135031j = 0;
                this.f135032k = 2;
                if (bVarY1.F(aVar2, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f135033l, this.f135034m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ne0.p>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        r(tq.e<? super r> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f135025f;
            Object objE = uq.b.e();
            int i15 = this.f135024e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p0.this, c0Var, null);
            this.f135025f = vq.j.a(c0Var);
            this.f135024e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ne0.p.DeleteDocument> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            return ((r) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            r rVar = p0.this.new r(eVar);
            rVar.f135025f = obj;
            return rVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lne0/d;", "<unused var>", "Lne0/p$b$a;", "Loq/i0;", "<anonymous>", "(Lne0/d;Lne0/p$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<ne0.d, ne0.p.b.InitialError, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135035e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f135035e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ne0.j> bVarY1 = p0.this.Y1();
                ne0.j.a aVar = ne0.j.a.f134890a;
                this.f135035e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ne0.d dVar, ne0.p.b.InitialError initialError, tq.e<? super oq.i0> eVar) {
            return p0.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lne0/d;", "<unused var>", "Lne0/p$b$b;", "Loq/i0;", "<anonymous>", "(Lne0/d;Lne0/p$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<ne0.d, ne0.p.b.LoadingError, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135037e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f135037e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ne0.j> bVarY1 = p0.this.Y1();
                ne0.j.a aVar = ne0.j.a.f134890a;
                this.f135037e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ne0.d dVar, ne0.p.b.LoadingError loadingError, tq.e<? super oq.i0> eVar) {
            return p0.this.new t(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/o;", "action", "Lk10/c0;", "Lne0/p$b$b;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<ne0.o, k10.c0<ne0.p.b.LoadingError>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135040f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.Updating O(k10.c0 c0Var, ne0.p.b.LoadingError loadingError) {
            return new ne0.p.Updating(((ne0.p.b.LoadingError) c0Var.a()).getDocumentId(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f135040f;
            uq.b.e();
            if (this.f135039e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ne0.i1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.u.O(c0Var, (p.b.LoadingError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne0.o oVar, k10.c0<ne0.p.b.LoadingError> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            u uVar = new u(eVar);
            uVar.f135040f = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne0/g;", "action", "Lk10/c0;", "Lne0/p$b$b;", "state", "Lk10/l;", "Lne0/p;", "<anonymous>", "(Lne0/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<ne0.g, k10.c0<ne0.p.b.LoadingError>, tq.e<? super k10.l<? extends ne0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135042f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne0.p.DeleteDocument O(k10.c0 c0Var, ne0.p.b.LoadingError loadingError) {
            return new ne0.p.DeleteDocument(((ne0.p.b.LoadingError) c0Var.a()).getDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f135042f;
            uq.b.e();
            if (this.f135041e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ne0.j1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.v.O(c0Var, (p.b.LoadingError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne0.g gVar, k10.c0<ne0.p.b.LoadingError> c0Var, tq.e<? super k10.l<? extends ne0.p>> eVar) {
            v vVar = new v(eVar);
            vVar.f135042f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    public p0(n20.j jVar, ac4.a aVar, he0.a aVar2, le0.i iVar, b00.c cVar, le0.h hVar, t2.a aVar3, je0.a aVar4, hb4.d dVar, cb4.j jVar2, mx.c cVar2, ib4.c cVar3, i70.n nVar, a.SetupData setupData) {
        this.callActionWithLoaderUseCase = aVar;
        this.uutCardDataStorageInteractor = aVar2;
        this.verificationDataMapper = iVar;
        this.imageConverter = cVar;
        this.mapper = hVar;
        this.deps = aVar3;
        this.getUutCardUC = aVar4;
        this.errorVMSFactory = dVar;
        this.dialogVmsFactory = jVar2;
        this.labelProvider = cVar2;
        this.genericDomainErrorMapper = cVar3;
        this.snackBarManagerStateHolder = nVar;
        this.setupData = setupData;
        ne0.p.Initial initial = new ne0.p.Initial(setupData.getDocumentId());
        this.initialState = initial;
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(initial, new er.l() { // from class: ne0.f0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.K9(this.f134877a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), ne0.q.a.b.f135044a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ne0.q.a D9(State<ne0.p> state) {
        return this.mapper.b(new le0.h.Params(state, new t2(this.deps, androidx.p016lifecycle.u0.a(this)), b9(ne0.a.f134855a), new er.l() { // from class: ne0.l0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.E9(this.f134898a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, new er.l() { // from class: ne0.m0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.F9(this.f134902a, (UutCardBottomSheetData) obj);
            }
        }, b9(ne0.e.f134871a), new er.l() { // from class: ne0.n0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.G9(this.f134905a, (UutCardDocument) obj);
            }
        }, b9(ne0.g.f134879a), new er.l() { // from class: ne0.o0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.H9(this.f134907a, (String) obj);
            }
        }, b9(ne0.o.f134906a), new er.l() { // from class: ne0.e0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.I9(this.f134872a, (DialogData) obj);
            }
        }, b9(ne0.f.f134876a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(p0 p0Var, y30.n.Switch.EnumC5973b enumC5973b) {
        p0Var.d9(new ChangeSwitchItem(enumC5973b));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(p0 p0Var, UutCardBottomSheetData uutCardBottomSheetData) {
        p0Var.d9(new ShowQrCode(uutCardBottomSheetData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(p0 p0Var, UutCardDocument uutCardDocument) {
        p0Var.d9(new ChangeDocument(uutCardDocument));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(p0 p0Var, String str) {
        p0Var.d9(new GoToVerification(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(p0 p0Var, DialogData dialogData) {
        p0Var.d9(new ShowDialog(dialogData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(final p0 p0Var, k10.v vVar) {
        vVar.c(fr.q0.c(ne0.p.Initial.class), new er.l() { // from class: ne0.d0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.L9(this.f134870a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ne0.p.Initialized.class), new er.l() { // from class: ne0.g0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.M9(this.f134880a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ne0.p.Updating.class), new er.l() { // from class: ne0.h0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.N9(this.f134885a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ne0.p.DeleteDocument.class), new er.l() { // from class: ne0.i0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.O9(this.f134888a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ne0.p.b.InitialError.class), new er.l() { // from class: ne0.j0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.P9(this.f134893a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ne0.p.b.LoadingError.class), new er.l() { // from class: ne0.k0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Q9(this.f134896a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(p0 p0Var, k10.z zVar) {
        zVar.C(p0Var.new c(null));
        d dVar = p0Var.new d(zVar, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(LoadDocumentData.class), oVar, dVar);
        zVar.v(fr.q0.c(ne0.l.class), oVar, p0Var.new e(null));
        zVar.v(fr.q0.c(ShowLoadingError.class), oVar, p0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(p0 p0Var, k10.z zVar) {
        h hVar = new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ChangeSwitchItem.class), oVar, hVar);
        zVar.v(fr.q0.c(ChangeDocument.class), oVar, new i(null));
        zVar.v(fr.q0.c(ne0.a.class), oVar, p0Var.new j(null));
        zVar.v(fr.q0.c(ShowQrCode.class), oVar, new k(null));
        zVar.v(fr.q0.c(ne0.e.class), oVar, new l(null));
        zVar.v(fr.q0.c(ne0.g.class), oVar, new m(null));
        zVar.v(fr.q0.c(ShowDialog.class), oVar, p0Var.new n(null));
        zVar.v(fr.q0.c(ne0.f.class), oVar, new o(null));
        zVar.x(fr.q0.c(GoToVerification.class), oVar, p0Var.new p(null));
        zVar.v(fr.q0.c(ne0.o.class), oVar, p0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(p0 p0Var, k10.z zVar) {
        zVar.A(p0Var.new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(p0 p0Var, k10.z zVar) {
        zVar.A(p0Var.new r(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(p0 p0Var, k10.z zVar) {
        s sVar = p0Var.new s(null);
        zVar.x(fr.q0.c(ne0.d.class), k10.o.CANCEL_PREVIOUS, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(p0 p0Var, k10.z zVar) {
        t tVar = p0Var.new t(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ne0.d.class), oVar, tVar);
        zVar.v(fr.q0.c(ne0.o.class), oVar, new u(null));
        zVar.v(fr.q0.c(ne0.g.class), oVar, new v(null));
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ne0.q.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<ne0.j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<ne0.p>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ne0.q.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
