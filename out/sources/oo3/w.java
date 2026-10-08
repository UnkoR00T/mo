package oo3;

import co3.QrCodeData;
import co3.Result;
import co3.SummaryData;
import eo3.MultiDocumentSelectorLabel;
import eo3.VerificationSelector;
import fr.q0;
import java.util.List;
import jo3.PersonPayloadData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\"\u0010#J,\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010%\u001a\u00020$2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001aH\u0082@¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020!2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020!2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/J9\u0010:\u001a\u0002092\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u0002052\b\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR&\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030L8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020S0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR \u0010^\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Loo3/w;", "Ll00/g;", "Loo3/d;", "Loo3/a;", "Loo3/e;", "", "Lyy/a;", "stateMachineFactory", "Lpo3/m;", "personScreenMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lho3/d;", "loadCitizenDataUseCase", "Lho3/g;", "sendCitizenDataUseCase", "Lho3/f;", "reloadCitizenDataUseCase", "Lho3/a;", "checkVerificationSessionStatusUseCase", "Lpo3/b;", "personErrorMapper", "Ljo3/c;", "personPayloadData", "<init>", "(Lyy/a;Lpo3/m;Lac4/a;Lho3/d;Lho3/g;Lho3/f;Lho3/a;Lpo3/b;Ljo3/c;)V", "Lk10/c0;", "Loo3/d$c;", "state", "Lk10/l;", "Loo3/d$b;", "B9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "E9", "(Loo3/d$b;Ltq/e;)Ljava/lang/Object;", "Lho3/f$a$a;", "paramsType", "D9", "(Lho3/f$a$a;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "", "sessionUuid", "z9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "A9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "", "Lco3/q;", "list", "Lco3/n;", "subDocument", "", "isSingleSubDocument", "Leo3/p;", "multiDocumentSelectorLabel", "Lco3/o;", "C9", "(Ljava/util/List;Lco3/n;ZLeo3/p;)Lco3/o;", "b", "Lpo3/m;", "c", "Lac4/a;", "d", "Lho3/d;", "e", "Lho3/g;", "f", "Lho3/f;", "g", "Lho3/a;", "h", "Lpo3/b;", "j", "Ljo3/c;", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Loo3/e$a;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Loo3/a$h;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<oo3.d, oo3.a> implements oo3.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final po3.m personScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ho3.d loadCitizenDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ho3.g sendCitizenDataUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ho3.f reloadCitizenDataUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ho3.a checkVerificationSessionStatusUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final po3.b personErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final PersonPayloadData personPayloadData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<oo3.d, oo3.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<oo3.e.a> state = a9(new e(e9().getState(), this), oo3.e.a.C3672a.f147909a);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<oo3.a.h> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f147958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f147959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f147960g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f147961h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f147962j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f147964l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f147964l = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
        
            if (r1.A9(r3, r5) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f147962j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f147959f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r5.f147958e
                dx.i r0 = (dx.i) r0
                oq.u.b(r6)
                goto L7b
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                oq.u.b(r6)
                goto L3f
            L26:
                oq.u.b(r6)
                oo3.w r6 = oo3.w.this
                ho3.a r6 = oo3.w.o9(r6)
                ho3.a$b r1 = new ho3.a$b
                java.lang.String r4 = r5.f147964l
                r1.<init>(r4)
                r5.f147962j = r3
                java.lang.Object r6 = r6.g(r1, r5)
                if (r6 != r0) goto L3f
                goto L69
            L3f:
                dx.i r6 = (dx.i) r6
                oo3.w r1 = oo3.w.this
                boolean r3 = r6 instanceof dx.i.Left
                if (r3 == 0) goto L6a
                r3 = r6
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                dx.b r3 = (dx.b) r3
                java.lang.Object r6 = vq.j.a(r6)
                r5.f147958e = r6
                java.lang.Object r6 = vq.j.a(r3)
                r5.f147959f = r6
                r6 = 0
                r5.f147960g = r6
                r5.f147961h = r6
                r5.f147962j = r2
                java.lang.Object r6 = oo3.w.u9(r1, r3, r5)
                if (r6 != r0) goto L7b
            L69:
                return r0
            L6a:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto L7e
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                oq.i0 r6 = (oq.i0) r6
                oo3.a$i r6 = oo3.a.i.f147882a
                oo3.w.n9(r1, r6)
            L7b:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            L7e:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: oo3.w.a.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return w.this.new a(this.f147964l, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Loo3/d$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super k10.l<? extends oo3.d.Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f147965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f147966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f147967g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f147968h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f147969j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f147970k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ k10.c0<oo3.d.Loading> f147972m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k10.c0<oo3.d.Loading> c0Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f147972m = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oo3.d.Initialized V(ho3.d.Result result, k10.c0 c0Var, oo3.d.Loading loading) {
            String securityToken = loading.getQrCodeData().getSecurityToken();
            String encodedCertificate = result.getEncodedCertificate();
            oq.r<k34.a0, k34.a0> rVarE = result.e();
            k34.g document = result.getDocument();
            List<co3.q> listD = result.d();
            co3.n subDocument = result.getSubDocument();
            List<co3.n> listG = result.g();
            List<k34.g> listA = result.a();
            QrCodeData qrCodeData = loading.getQrCodeData();
            wn3.c entryPoint = ((oo3.d.Loading) c0Var.a()).getEntryPoint();
            VerificationSelector verificationSelector = result.getVerificationSelector();
            return new oo3.d.Initialized(document, listD, subDocument, listG, listA, securityToken, encodedCertificate, rVarE, qrCodeData, entryPoint, verificationSelector != null ? verificationSelector.getLabel() : null, null, null, 6144, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0<oo3.d.Loading> c0Var;
            Object objE = uq.b.e();
            int i15 = this.f147970k;
            if (i15 == 0) {
                oq.u.b(obj);
                ho3.d dVar = w.this.loadCitizenDataUseCase;
                ho3.d.Params params = new ho3.d.Params(this.f147972m.a().getQrCodeData(), this.f147972m.a().getEntryPoint());
                this.f147970k = 1;
                obj = dVar.d(params, this);
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
                c0Var = (k10.c0) this.f147966f;
                oq.u.b(obj);
            }
            return c0Var.c();
            dx.i iVar = (dx.i) obj;
            w wVar = w.this;
            final k10.c0<oo3.d.Loading> c0Var2 = this.f147972m;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final ho3.d.Result result = (ho3.d.Result) ((dx.i.Right) iVar).b();
                return c0Var2.d(new er.l() { // from class: oo3.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return w.b.V(result, c0Var2, (d.Loading) obj2);
                    }
                });
            }
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            this.f147965e = vq.j.a(iVar);
            this.f147966f = c0Var2;
            this.f147967g = vq.j.a(bVar);
            this.f147968h = 0;
            this.f147969j = 0;
            this.f147970k = 2;
            if (wVar.A9(bVar, this) != objE) {
                c0Var = c0Var2;
                return c0Var.c();
            }
            return objE;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return w.this.new b(this.f147972m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<oo3.d.Initialized>> eVar) {
            return ((b) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Loo3/d$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super k10.l<? extends oo3.d.Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f147973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f147974f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f147975g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f147976h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f147977j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f147978k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ho3.f.Params.AbstractC2006a f147980m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ k10.c0<oo3.d.Initialized> f147981n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ho3.f.Params.AbstractC2006a abstractC2006a, k10.c0<oo3.d.Initialized> c0Var, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f147980m = abstractC2006a;
            this.f147981n = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oo3.d.Initialized X(Result result, ho3.f.Params.AbstractC2006a abstractC2006a, oo3.d.Initialized initialized) {
            oq.r<k34.a0, k34.a0> rVarB = ((Result.a.Main) result.getResultType()).b();
            k34.g selectedDocument = ((ho3.f.Params.AbstractC2006a.Main) abstractC2006a).getSelectedDocument();
            List<co3.q> listA = ((Result.a.Main) result.getResultType()).a();
            co3.n subDocument = ((Result.a.Main) result.getResultType()).getSubDocument();
            List<co3.n> listD = ((Result.a.Main) result.getResultType()).d();
            VerificationSelector verificationSelector = ((Result.a.Main) result.getResultType()).getVerificationSelector();
            return oo3.d.Initialized.c(initialized, selectedDocument, listA, subDocument, listD, null, null, null, rVarB, null, null, verificationSelector != null ? verificationSelector.getLabel() : null, null, null, 7024, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oo3.d.Initialized Y(Result result, ho3.f.Params.AbstractC2006a abstractC2006a, oo3.d.Initialized initialized) {
            return oo3.d.Initialized.c(initialized, null, ((Result.a.Sub) result.getResultType()).a(), ((ho3.f.Params.AbstractC2006a.Sub) abstractC2006a).getSubDocument(), null, null, null, null, null, null, null, null, null, null, 8185, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0<oo3.d.Initialized> c0Var;
            Object objE = uq.b.e();
            int i15 = this.f147978k;
            if (i15 == 0) {
                oq.u.b(obj);
                ho3.f fVar = w.this.reloadCitizenDataUseCase;
                ho3.f.Params params = new ho3.f.Params(this.f147980m);
                this.f147978k = 1;
                obj = fVar.f(params, this);
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
                c0Var = (k10.c0) this.f147974f;
                oq.u.b(obj);
            }
            return c0Var.c();
            dx.i iVar = (dx.i) obj;
            w wVar = w.this;
            k10.c0<oo3.d.Initialized> c0Var2 = this.f147981n;
            final ho3.f.Params.AbstractC2006a abstractC2006a = this.f147980m;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final Result result = (Result) ((dx.i.Right) iVar).b();
                Result.a resultType = result.getResultType();
                if (resultType instanceof Result.a.Main) {
                    return c0Var2.b(new er.l() { // from class: oo3.y
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return w.c.X(result, abstractC2006a, (d.Initialized) obj2);
                        }
                    });
                }
                if (resultType instanceof Result.a.Sub) {
                    return c0Var2.b(new er.l() { // from class: oo3.z
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return w.c.Y(result, abstractC2006a, (d.Initialized) obj2);
                        }
                    });
                }
                throw new oq.p();
            }
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            this.f147973e = vq.j.a(iVar);
            this.f147974f = c0Var2;
            this.f147975g = vq.j.a(bVar);
            this.f147976h = 0;
            this.f147977j = 0;
            this.f147978k = 2;
            if (wVar.A9(bVar, this) != objE) {
                c0Var = c0Var2;
                return c0Var.c();
            }
            return objE;
        }

        public final tq.e<i0> O(tq.e<?> eVar) {
            return w.this.new c(this.f147980m, this.f147981n, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<oo3.d.Initialized>> eVar) {
            return ((c) O(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f147982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f147983f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f147984g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f147985h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f147986j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ oo3.d.Initialized f147988l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(oo3.d.Initialized initialized, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f147988l = initialized;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
        
            if (r1.A9(r3, r13) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r13.f147986j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r13.f147983f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r13.f147982e
                dx.i r0 = (dx.i) r0
                oq.u.b(r14)
                goto Lae
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                oq.u.b(r14)
                goto L72
            L27:
                oq.u.b(r14)
                oo3.w r14 = oo3.w.this
                ho3.g r14 = oo3.w.t9(r14)
                oo3.d$b r1 = r13.f147988l
                oq.r r6 = r1.l()
                oo3.d$b r1 = r13.f147988l
                java.lang.String r8 = r1.getSessionUuid()
                oo3.d$b r1 = r13.f147988l
                co3.e r10 = r1.getQrCodeData()
                oo3.d$b r1 = r13.f147988l
                k34.g r5 = r1.getSelectedDocument()
                oo3.d$b r1 = r13.f147988l
                java.lang.String r9 = r1.getEncodedCertificate()
                oo3.d$b r1 = r13.f147988l
                co3.e r1 = r1.getQrCodeData()
                java.lang.String r11 = r1.getValidTime()
                oo3.d$b r1 = r13.f147988l
                co3.n r7 = r1.getSubDocument()
                oo3.d$b r1 = r13.f147988l
                wn3.c r12 = r1.getEntryPoint()
                ho3.g$a r4 = new ho3.g$a
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                r13.f147986j = r3
                java.lang.Object r14 = r14.f(r4, r13)
                if (r14 != r0) goto L72
                goto L9c
            L72:
                dx.i r14 = (dx.i) r14
                oo3.w r1 = oo3.w.this
                boolean r3 = r14 instanceof dx.i.Left
                if (r3 == 0) goto L9d
                r3 = r14
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                dx.b r3 = (dx.b) r3
                java.lang.Object r14 = vq.j.a(r14)
                r13.f147982e = r14
                java.lang.Object r14 = vq.j.a(r3)
                r13.f147983f = r14
                r14 = 0
                r13.f147984g = r14
                r13.f147985h = r14
                r13.f147986j = r2
                java.lang.Object r14 = oo3.w.u9(r1, r3, r13)
                if (r14 != r0) goto Lae
            L9c:
                return r0
            L9d:
                boolean r0 = r14 instanceof dx.i.Right
                if (r0 == 0) goto Lb1
                dx.i$c r14 = (dx.i.Right) r14
                java.lang.Object r14 = r14.b()
                oq.i0 r14 = (oq.i0) r14
                oo3.a$d r14 = oo3.a.d.f147873a
                oo3.w.n9(r1, r14)
            Lae:
                oq.i0 r14 = oq.i0.f148189a
                return r14
            Lb1:
                oq.p r14 = new oq.p
                r14.<init>()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: oo3.w.d.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return w.this.new d(this.f147988l, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<oo3.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f147989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f147990b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f147991a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f147992b;

            /* JADX INFO: renamed from: oo3.w$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3673a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f147993d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f147994e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f147995f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f147997h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f147998j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f147999k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f148000l;

                public C3673a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f147993d = obj;
                    this.f147994e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w wVar) {
                this.f147991a = hVar;
                this.f147992b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3673a c3673a;
                if (eVar instanceof C3673a) {
                    c3673a = (C3673a) eVar;
                    int i15 = c3673a.f147994e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3673a.f147994e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3673a = new C3673a(eVar);
                    }
                } else {
                    c3673a = new C3673a(eVar);
                }
                Object obj2 = c3673a.f147993d;
                Object objE = uq.b.e();
                int i16 = c3673a.f147994e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f147991a;
                    oo3.e.a aVarB = this.f147992b.personScreenMapper.b(new po3.m.Params((oo3.d) obj, this.f147992b.b9(oo3.a.C3670a.f147870a), this.f147992b.b9(oo3.a.k.f147884a), this.f147992b.new f(), this.f147992b.new g(), this.f147992b.new h(), this.f147992b.b9(oo3.a.g.f147876a)));
                    c3673a.f147995f = vq.j.a(obj);
                    c3673a.f147997h = vq.j.a(c3673a);
                    c3673a.f147998j = vq.j.a(obj);
                    c3673a.f147999k = vq.j.a(hVar);
                    c3673a.f148000l = 0;
                    c3673a.f147994e = 1;
                    if (hVar.F(aVarB, c3673a) == objE) {
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

        public e(mu.g gVar, w wVar) {
            this.f147989a = gVar;
            this.f147990b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super oo3.e.a> hVar, tq.e eVar) {
            Object objA = this.f147989a.a(new a(hVar, this.f147990b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements er.l<k34.g, i0> {
        f() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(k34.g gVar) {
            c(gVar);
            return i0.f148189a;
        }

        public final void c(k34.g gVar) {
            w.this.d9(new oo3.a.ChangeDocumentClicked(gVar));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g implements er.l<co3.n, i0> {
        g() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(co3.n nVar) {
            c(nVar);
            return i0.f148189a;
        }

        public final void c(co3.n nVar) {
            w.this.d9(new oo3.a.ChangeSubDocumentClicked(nVar));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h implements er.l<jo3.b, i0> {
        h() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(jo3.b bVar) {
            c(bVar);
            return i0.f148189a;
        }

        public final void c(jo3.b bVar) {
            w.this.d9(new oo3.a.ShowBottomSheet(bVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loo3/a$e;", "<unused var>", "Loo3/d;", "Loq/i0;", "<anonymous>", "(Loo3/a$e;Loo3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<oo3.a.e, oo3.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148004e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f148004e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<oo3.a.h> bVarY1 = w.this.Y1();
                oo3.a.h.b bVar = oo3.a.h.b.f147878a;
                this.f148004e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(oo3.a.e eVar, oo3.d dVar, tq.e<? super i0> eVar2) {
            return w.this.new i(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loo3/a$f;", "<unused var>", "Loo3/d;", "Loq/i0;", "<anonymous>", "(Loo3/a$f;Loo3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<oo3.a.f, oo3.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148006e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f148006e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<oo3.a.h> bVarY1 = w.this.Y1();
                oo3.a.h.d dVar = oo3.a.h.d.f147880a;
                this.f148006e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(oo3.a.f fVar, oo3.d dVar, tq.e<? super i0> eVar) {
            return w.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loo3/a$a;", "<unused var>", "Loo3/d$a;", "Loq/i0;", "<anonymous>", "(Loo3/a$a;Loo3/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<oo3.a.C3670a, oo3.d.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148008e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f148008e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<oo3.a.h> bVarY1 = w.this.Y1();
                oo3.a.h.C3671a c3671a = oo3.a.h.C3671a.f147877a;
                this.f148008e = 1;
                if (bVarY1.F(c3671a, this) == objE) {
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
        public final Object w(oo3.a.C3670a c3670a, oo3.d.a aVar, tq.e<? super i0> eVar) {
            return w.this.new k(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Loo3/d$a;", "state", "Lk10/l;", "Loo3/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<oo3.d.a>, tq.e<? super k10.l<? extends oo3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148011f;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oo3.d.Loading O(w wVar, oo3.d.a aVar) {
            return new oo3.d.Loading(wVar.personPayloadData.getQrCodeData(), wVar.personPayloadData.getVerificationEntryPoint());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f148011f;
            uq.b.e();
            if (this.f148010e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final w wVar = w.this;
            return c0Var.d(new er.l() { // from class: oo3.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.l.O(wVar, (d.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<oo3.d.a> c0Var, tq.e<? super k10.l<? extends oo3.d>> eVar) {
            return ((l) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            l lVar = w.this.new l(eVar);
            lVar.f148011f = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Loo3/d$c;", "state", "Lk10/l;", "Loo3/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<k10.c0<oo3.d.Loading>, tq.e<? super k10.l<? extends oo3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148014f;

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f148014f;
            Object objE = uq.b.e();
            int i15 = this.f148013e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            w wVar = w.this;
            this.f148014f = vq.j.a(c0Var);
            this.f148013e = 1;
            Object objB9 = wVar.B9(c0Var, this);
            return objB9 == objE ? objE : objB9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<oo3.d.Loading> c0Var, tq.e<? super k10.l<? extends oo3.d>> eVar) {
            return ((m) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            m mVar = w.this.new m(eVar);
            mVar.f148014f = obj;
            return mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loo3/a$a;", "<unused var>", "Loo3/d$c;", "Loq/i0;", "<anonymous>", "(Loo3/a$a;Loo3/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<oo3.a.C3670a, oo3.d.Loading, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148016e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f148016e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<oo3.a.h> bVarY1 = w.this.Y1();
                oo3.a.h.C3671a c3671a = oo3.a.h.C3671a.f147877a;
                this.f148016e = 1;
                if (bVarY1.F(c3671a, this) == objE) {
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
        public final Object w(oo3.a.C3670a c3670a, oo3.d.Loading loading, tq.e<? super i0> eVar) {
            return w.this.new n(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loo3/a$j;", "<unused var>", "Lk10/c0;", "Loo3/d$c;", "state", "Lk10/l;", "Loo3/d;", "<anonymous>", "(Loo3/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<oo3.a.j, k10.c0<oo3.d.Loading>, tq.e<? super k10.l<? extends oo3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148019f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f148019f;
            Object objE = uq.b.e();
            int i15 = this.f148018e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            w wVar = w.this;
            this.f148019f = vq.j.a(c0Var);
            this.f148018e = 1;
            Object objB9 = wVar.B9(c0Var, this);
            return objB9 == objE ? objE : objB9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(oo3.a.j jVar, k10.c0<oo3.d.Loading> c0Var, tq.e<? super k10.l<? extends oo3.d>> eVar) {
            o oVar = w.this.new o(eVar);
            oVar.f148019f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loo3/a$a;", "<unused var>", "Loo3/d$b;", "state", "Loq/i0;", "<anonymous>", "(Loo3/a$a;Loo3/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<oo3.a.C3670a, oo3.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148022f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oo3.d.Initialized initialized = (oo3.d.Initialized) this.f148022f;
            Object objE = uq.b.e();
            int i15 = this.f148021e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (initialized.getModalBottomSheetValue() != g30.v.HIDDEN) {
                    w.this.d9(oo3.a.g.f147876a);
                } else {
                    xw.b<oo3.a.h> bVarY1 = w.this.Y1();
                    oo3.a.h.C3671a c3671a = oo3.a.h.C3671a.f147877a;
                    this.f148022f = vq.j.a(initialized);
                    this.f148021e = 1;
                    if (bVarY1.F(c3671a, this) == objE) {
                        return objE;
                    }
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
        public final Object w(oo3.a.C3670a c3670a, oo3.d.Initialized initialized, tq.e<? super i0> eVar) {
            p pVar = w.this.new p(eVar);
            pVar.f148022f = initialized;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loo3/a$k;", "<unused var>", "Loo3/d$b;", "state", "Loq/i0;", "<anonymous>", "(Loo3/a$k;Loo3/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<oo3.a.k, oo3.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148025f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oo3.d.Initialized initialized = (oo3.d.Initialized) this.f148025f;
            Object objE = uq.b.e();
            int i15 = this.f148024e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                this.f148025f = vq.j.a(initialized);
                this.f148024e = 1;
                if (wVar.E9(initialized, this) == objE) {
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
        public final Object w(oo3.a.k kVar, oo3.d.Initialized initialized, tq.e<? super i0> eVar) {
            q qVar = w.this.new q(eVar);
            qVar.f148025f = initialized;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loo3/a$j;", "<unused var>", "Loo3/d$b;", "state", "Loq/i0;", "<anonymous>", "(Loo3/a$j;Loo3/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<oo3.a.j, oo3.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148028f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oo3.d.Initialized initialized = (oo3.d.Initialized) this.f148028f;
            Object objE = uq.b.e();
            int i15 = this.f148027e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                this.f148028f = vq.j.a(initialized);
                this.f148027e = 1;
                if (wVar.E9(initialized, this) == objE) {
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
        public final Object w(oo3.a.j jVar, oo3.d.Initialized initialized, tq.e<? super i0> eVar) {
            r rVar = w.this.new r(eVar);
            rVar.f148028f = initialized;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loo3/a$i;", "<unused var>", "Loo3/d$b;", "state", "Loq/i0;", "<anonymous>", "(Loo3/a$i;Loo3/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<oo3.a.i, oo3.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f148030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f148031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f148032g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oo3.d.Initialized initialized = (oo3.d.Initialized) this.f148032g;
            Object objE = uq.b.e();
            int i15 = this.f148031f;
            if (i15 == 0) {
                oq.u.b(obj);
                SummaryData summaryDataC9 = w.this.C9(initialized.g(), initialized.getSubDocument(), initialized.a(), initialized.getMultiDocumentSelectorLabel());
                xw.b<oo3.a.h> bVarY1 = w.this.Y1();
                oo3.a.h.Next next = new oo3.a.h.Next(summaryDataC9);
                this.f148032g = vq.j.a(initialized);
                this.f148030e = vq.j.a(summaryDataC9);
                this.f148031f = 1;
                if (bVarY1.F(next, this) == objE) {
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
        public final Object w(oo3.a.i iVar, oo3.d.Initialized initialized, tq.e<? super i0> eVar) {
            s sVar = w.this.new s(eVar);
            sVar.f148032g = initialized;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loo3/a$b;", "action", "Lk10/c0;", "Loo3/d$b;", "state", "Lk10/l;", "Loo3/d;", "<anonymous>", "(Loo3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<oo3.a.ChangeDocumentClicked, k10.c0<oo3.d.Initialized>, tq.e<? super k10.l<? extends oo3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148035f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f148036g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oo3.a.ChangeDocumentClicked changeDocumentClicked = (oo3.a.ChangeDocumentClicked) this.f148035f;
            k10.c0 c0Var = (k10.c0) this.f148036g;
            Object objE = uq.b.e();
            int i15 = this.f148034e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            w wVar = w.this;
            ho3.f.Params.AbstractC2006a.Main main = new ho3.f.Params.AbstractC2006a.Main(changeDocumentClicked.getDocument());
            this.f148035f = vq.j.a(changeDocumentClicked);
            this.f148036g = vq.j.a(c0Var);
            this.f148034e = 1;
            Object objD9 = wVar.D9(main, c0Var, this);
            return objD9 == objE ? objE : objD9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(oo3.a.ChangeDocumentClicked changeDocumentClicked, k10.c0<oo3.d.Initialized> c0Var, tq.e<? super k10.l<? extends oo3.d>> eVar) {
            t tVar = w.this.new t(eVar);
            tVar.f148035f = changeDocumentClicked;
            tVar.f148036g = c0Var;
            return tVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loo3/a$c;", "action", "Lk10/c0;", "Loo3/d$b;", "state", "Lk10/l;", "Loo3/d;", "<anonymous>", "(Loo3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<oo3.a.ChangeSubDocumentClicked, k10.c0<oo3.d.Initialized>, tq.e<? super k10.l<? extends oo3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148039f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f148040g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oo3.a.ChangeSubDocumentClicked changeSubDocumentClicked = (oo3.a.ChangeSubDocumentClicked) this.f148039f;
            k10.c0 c0Var = (k10.c0) this.f148040g;
            Object objE = uq.b.e();
            int i15 = this.f148038e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            w wVar = w.this;
            ho3.f.Params.AbstractC2006a.Sub sub = new ho3.f.Params.AbstractC2006a.Sub(changeSubDocumentClicked.getSubDocument(), ((oo3.d.Initialized) c0Var.a()).l(), ((oo3.d.Initialized) c0Var.a()).getEntryPoint());
            this.f148039f = vq.j.a(changeSubDocumentClicked);
            this.f148040g = vq.j.a(c0Var);
            this.f148038e = 1;
            Object objD9 = wVar.D9(sub, c0Var, this);
            return objD9 == objE ? objE : objD9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(oo3.a.ChangeSubDocumentClicked changeSubDocumentClicked, k10.c0<oo3.d.Initialized> c0Var, tq.e<? super k10.l<? extends oo3.d>> eVar) {
            u uVar = w.this.new u(eVar);
            uVar.f148039f = changeSubDocumentClicked;
            uVar.f148040g = c0Var;
            return uVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loo3/a$l;", "action", "Lk10/c0;", "Loo3/d$b;", "state", "Lk10/l;", "Loo3/d;", "<anonymous>", "(Loo3/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<oo3.a.ShowBottomSheet, k10.c0<oo3.d.Initialized>, tq.e<? super k10.l<? extends oo3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148042e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148043f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f148044g;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oo3.d.Initialized O(oo3.a.ShowBottomSheet showBottomSheet, oo3.d.Initialized initialized) {
            return oo3.d.Initialized.c(initialized, null, null, null, null, null, null, null, null, null, null, null, g30.v.EXPANDED, showBottomSheet.getPersonBottomSheetType(), 2047, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final oo3.a.ShowBottomSheet showBottomSheet = (oo3.a.ShowBottomSheet) this.f148043f;
            k10.c0 c0Var = (k10.c0) this.f148044g;
            uq.b.e();
            if (this.f148042e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: oo3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.v.O(showBottomSheet, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(oo3.a.ShowBottomSheet showBottomSheet, k10.c0<oo3.d.Initialized> c0Var, tq.e<? super k10.l<? extends oo3.d>> eVar) {
            v vVar = new v(eVar);
            vVar.f148043f = showBottomSheet;
            vVar.f148044g = c0Var;
            return vVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: oo3.w$w, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loo3/a$g;", "<unused var>", "Lk10/c0;", "Loo3/d$b;", "state", "Lk10/l;", "Loo3/d;", "<anonymous>", "(Loo3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C3674w extends vq.k implements er.q<oo3.a.g, k10.c0<oo3.d.Initialized>, tq.e<? super k10.l<? extends oo3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148046f;

        C3674w(tq.e<? super C3674w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oo3.d.Initialized O(oo3.d.Initialized initialized) {
            return oo3.d.Initialized.c(initialized, null, null, null, null, null, null, null, null, null, null, null, g30.v.HIDDEN, jo3.b.NONE, 2047, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f148046f;
            uq.b.e();
            if (this.f148045e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: oo3.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.C3674w.O((d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(oo3.a.g gVar, k10.c0<oo3.d.Initialized> c0Var, tq.e<? super k10.l<? extends oo3.d>> eVar) {
            C3674w c3674w = new C3674w(eVar);
            c3674w.f148046f = c0Var;
            return c3674w.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loo3/a$d;", "<unused var>", "Loo3/d$b;", "state", "Loq/i0;", "<anonymous>", "(Loo3/a$d;Loo3/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<oo3.a.d, oo3.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f148048f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oo3.d.Initialized initialized = (oo3.d.Initialized) this.f148048f;
            Object objE = uq.b.e();
            int i15 = this.f148047e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                String sessionUuid = initialized.getSessionUuid();
                this.f148048f = vq.j.a(initialized);
                this.f148047e = 1;
                if (wVar.z9(sessionUuid, this) == objE) {
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
        public final Object w(oo3.a.d dVar, oo3.d.Initialized initialized, tq.e<? super i0> eVar) {
            x xVar = w.this.new x(eVar);
            xVar.f148048f = initialized;
            return xVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, po3.m mVar, ac4.a aVar2, ho3.d dVar, ho3.g gVar, ho3.f fVar, ho3.a aVar3, po3.b bVar, PersonPayloadData personPayloadData) {
        this.personScreenMapper = mVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.loadCitizenDataUseCase = dVar;
        this.sendCitizenDataUseCase = gVar;
        this.reloadCitizenDataUseCase = fVar;
        this.checkVerificationSessionStatusUseCase = aVar3;
        this.personErrorMapper = bVar;
        this.personPayloadData = personPayloadData;
        this.stateMachine = aVar.a(oo3.d.a.f147893a, new er.l() { // from class: oo3.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.G9(this.f147946a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A9(dx.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new oo3.a.h.Error(this.personErrorMapper.b(new po3.b.Params(bVar, b9(oo3.a.C3670a.f147870a), b9(oo3.a.j.f147883a), b9(oo3.a.e.f147874a), b9(oo3.a.f.f147875a), b9(oo3.a.d.f147873a)))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B9(k10.c0<oo3.d.Loading> c0Var, tq.e<? super k10.l<oo3.d.Initialized>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SummaryData C9(List<? extends co3.q> list, co3.n subDocument, boolean isSingleSubDocument, MultiDocumentSelectorLabel multiDocumentSelectorLabel) {
        return new SummaryData(new SummaryData.a.Person(subDocument, isSingleSubDocument, multiDocumentSelectorLabel), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D9(ho3.f.Params.AbstractC2006a abstractC2006a, k10.c0<oo3.d.Initialized> c0Var, tq.e<? super k10.l<oo3.d.Initialized>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new c(abstractC2006a, c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E9(oo3.d.Initialized initialized, tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new d(initialized, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(oo3.d.class), new er.l() { // from class: oo3.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.H9(this.f147942a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(oo3.d.a.class), new er.l() { // from class: oo3.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.I9(this.f147943a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(oo3.d.Loading.class), new er.l() { // from class: oo3.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.J9(this.f147944a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(oo3.d.Initialized.class), new er.l() { // from class: oo3.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.K9(this.f147945a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(w wVar, k10.z zVar) {
        i iVar = wVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(oo3.a.e.class), oVar, iVar);
        zVar.x(q0.c(oo3.a.f.class), oVar, wVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(w wVar, k10.z zVar) {
        k kVar = wVar.new k(null);
        zVar.x(q0.c(oo3.a.C3670a.class), k10.o.CANCEL_PREVIOUS, kVar);
        zVar.A(wVar.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(w wVar, k10.z zVar) {
        zVar.A(wVar.new m(null));
        n nVar = wVar.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(oo3.a.C3670a.class), oVar, nVar);
        zVar.v(q0.c(oo3.a.j.class), oVar, wVar.new o(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(w wVar, k10.z zVar) {
        p pVar = wVar.new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(oo3.a.C3670a.class), oVar, pVar);
        zVar.x(q0.c(oo3.a.k.class), oVar, wVar.new q(null));
        zVar.x(q0.c(oo3.a.j.class), oVar, wVar.new r(null));
        zVar.x(q0.c(oo3.a.i.class), oVar, wVar.new s(null));
        zVar.v(q0.c(oo3.a.ChangeDocumentClicked.class), oVar, wVar.new t(null));
        zVar.v(q0.c(oo3.a.ChangeSubDocumentClicked.class), oVar, wVar.new u(null));
        zVar.v(q0.c(oo3.a.ShowBottomSheet.class), oVar, new v(null));
        zVar.v(q0.c(oo3.a.g.class), oVar, new C3674w(null));
        zVar.x(q0.c(oo3.a.d.class), oVar, wVar.new x(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z9(String str, tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(str, null), eVar, 1, null);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(PersonPayloadData personPayloadData) {
        super.P5(personPayloadData);
    }

    @Override // zx.b
    public xw.b<oo3.a.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<oo3.d, oo3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<oo3.e.a> getState() {
        return this.state;
    }
}
