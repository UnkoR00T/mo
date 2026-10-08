package re2;

import cb4.DialogData;
import fr.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import mu.p0;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zd2.ImageAttachments;
import zd2.Photo;
import zp0.BEReportIncidentTypes;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B£\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0001\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0013\u00104\u001a\u000203*\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J6\u0010B\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020A0@2\u0018\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<0;H\u0082@¢\u0006\u0004\bB\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR \u0010n\u001a\b\u0012\u0004\u0012\u00020i0h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR&\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030s8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR \u0010.\u001a\b\u0012\u0004\u0012\u00020/0y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}¨\u0006~"}, d2 = {"Lre2/z;", "Ll00/g;", "Lre2/e;", "Lre2/a;", "Lre2/f;", "", "Lyy/a;", "stateMachineFactory", "Lse2/e;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Laq0/b;", "beGetReportIncidentTypesUC", "Lac4/a;", "callActionWithLoaderUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Lmx/c;", "labelProvider", "Lse2/b;", "filePickerBusinessErrorMapper", "Lse2/a;", "duplicatePhotoDialogMapper", "Lae2/c;", "pickIncidentPhotoFromCameraWithAttachmentsUC", "Lbc4/e;", "createThumbnailUseCase", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "Lcb4/j;", "dialogVMSFactory", "Lae2/e;", "pickPhotoWithAttachmentsExifFromGalleryUC", "Lb00/c;", "imageConverter", "Lre2/g;", "setupContract", "<init>", "(Lyy/a;Lse2/e;Lhb4/d;Lib4/c;Laq0/b;Lac4/a;La14/m;Lyw/b;Lmx/c;Lse2/b;Lse2/a;Lae2/c;Lbc4/e;Lez/e;Lez/a;Lcb4/j;Lae2/e;Lb00/c;Lre2/g;)V", "state", "Lre2/f$a;", "L9", "(Lre2/e;)Lre2/f$a;", "Ldx/b;", "Ljb4/b;", "P9", "(Ldx/b;)Ljb4/b;", "", "uri", "", "K9", "(Ljava/lang/String;)Z", "", "Loq/r;", "Lwx/i$a;", "Lzd2/b;", "incidentPhotos", "Ldx/i;", "Loq/i0;", "R9", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "b", "Lse2/e;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Laq0/b;", "f", "Lac4/a;", "g", "La14/m;", "h", "Lyw/b;", "j", "Lmx/c;", "k", "Lse2/b;", "l", "Lse2/a;", "m", "Lae2/c;", "n", "Lbc4/e;", "p", "Lez/e;", "q", "Lez/a;", "r", "Lcb4/j;", "s", "Lae2/e;", "t", "Lb00/c;", "v", "Lre2/g;", "Lxw/b;", "Lre2/a$f;", "w", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lre2/d;", "x", "Lre2/d;", "initialState", "Lk10/t;", "y", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<re2.e, re2.a> implements re2.f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final se2.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final aq0.b beGetReportIncidentTypesUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final se2.b filePickerBusinessErrorMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final se2.a duplicatePhotoDialogMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ae2.c pickIncidentPhotoFromCameraWithAttachmentsUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final bc4.e createThumbnailUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ae2.e pickPhotoWithAttachmentsExifFromGalleryUC;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final re2.g setupContract;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final xw.b<re2.a.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final re2.d initialState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final k10.t<re2.e, re2.a> stateMachine;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final p0<re2.f.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<re2.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f173558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f173559b;

        /* JADX INFO: renamed from: re2.z$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4431a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f173560a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f173561b;

            /* JADX INFO: renamed from: re2.z$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4432a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f173562d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f173563e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f173564f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f173566h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f173567j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f173568k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f173569l;

                public C4432a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f173562d = obj;
                    this.f173563e |= PKIFailureInfo.systemUnavail;
                    return C4431a.this.F(null, this);
                }
            }

            public C4431a(mu.h hVar, z zVar) {
                this.f173560a = hVar;
                this.f173561b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4432a c4432a;
                if (eVar instanceof C4432a) {
                    c4432a = (C4432a) eVar;
                    int i15 = c4432a.f173563e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4432a.f173563e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4432a = new C4432a(eVar);
                    }
                } else {
                    c4432a = new C4432a(eVar);
                }
                Object obj2 = c4432a.f173562d;
                Object objE = uq.b.e();
                int i16 = c4432a.f173563e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f173560a;
                    re2.f.a aVarL9 = this.f173561b.L9((re2.e) obj);
                    c4432a.f173564f = vq.j.a(obj);
                    c4432a.f173566h = vq.j.a(c4432a);
                    c4432a.f173567j = vq.j.a(obj);
                    c4432a.f173568k = vq.j.a(hVar);
                    c4432a.f173569l = 0;
                    c4432a.f173563e = 1;
                    if (hVar.F(aVarL9, c4432a) == objE) {
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

        public a(mu.g gVar, z zVar) {
            this.f173558a = gVar;
            this.f173559b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super re2.f.a> hVar, tq.e eVar) {
            Object objA = this.f173558a.a(new C4431a(hVar, this.f173559b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lre2/a$h;", "<unused var>", "Lre2/e;", "Loq/i0;", "<anonymous>", "(Lre2/a$h;Lre2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<re2.a.h, re2.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173570e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173570e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                re2.a.f.C4428a c4428a = re2.a.f.C4428a.f173466a;
                this.f173570e = 1;
                if (zVar.F(c4428a, this) == objE) {
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
        public final Object w(re2.a.h hVar, re2.e eVar, tq.e<? super oq.i0> eVar2) {
            return z.this.new b(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lre2/d;", "it", "Loq/i0;", "<anonymous>", "(Lre2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<re2.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173572e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f173572e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(re2.a.n.f173478a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(re2.d dVar, tq.e<? super oq.i0> eVar) {
            return ((c) v(dVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lre2/a$n;", "<unused var>", "Lk10/c0;", "Lre2/d;", "state", "Lk10/l;", "Lre2/e;", "<anonymous>", "(Lre2/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<re2.a.n, k10.c0<re2.d>, tq.e<? super k10.l<? extends re2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173575f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lre2/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends re2.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f173577e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ z f173578f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<re2.d> f173579g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<re2.d> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f173578f = zVar;
                this.f173579g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final re2.e.a.Screen V(BEReportIncidentTypes bEReportIncidentTypes, re2.d dVar) {
                return new re2.e.a.Screen(new InitializedData(null, bEReportIncidentTypes.getImageConfig(), null, 5, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f173577e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    aq0.b bVar = this.f173578f.beGetReportIncidentTypesUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f173577e = 1;
                    obj = bVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                z zVar = this.f173578f;
                k10.c0<re2.d> c0Var = this.f173579g;
                if (iVar instanceof dx.i.Left) {
                    zVar.d9(new re2.a.LoadConfigurationError((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEReportIncidentTypes bEReportIncidentTypes = (BEReportIncidentTypes) ((dx.i.Right) iVar).b();
                zVar.setupContract.k3(bEReportIncidentTypes);
                return c0Var.d(new er.l() { // from class: re2.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.d.a.V(bEReportIncidentTypes, (d) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f173578f, this.f173579g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends re2.e>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f173575f;
            Object objE = uq.b.e();
            int i15 = this.f173574e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(z.this, c0Var, null);
            this.f173575f = vq.j.a(c0Var);
            this.f173574e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.n nVar, k10.c0<re2.d> c0Var, tq.e<? super k10.l<? extends re2.e>> eVar) {
            d dVar = z.this.new d(eVar);
            dVar.f173575f = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lre2/a$e;", "action", "Lk10/c0;", "Lre2/d;", "state", "Lk10/l;", "Lre2/e;", "<anonymous>", "(Lre2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<re2.a.LoadConfigurationError, k10.c0<re2.d>, tq.e<? super k10.l<? extends re2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f173582g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error O(z zVar, re2.a.LoadConfigurationError loadConfigurationError, re2.d dVar) {
            return new Error(zVar.errorVMSFactory.a(zVar.P9(loadConfigurationError.getDomainError())));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final re2.a.LoadConfigurationError loadConfigurationError = (re2.a.LoadConfigurationError) this.f173581f;
            k10.c0 c0Var = (k10.c0) this.f173582g;
            uq.b.e();
            if (this.f173580e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final z zVar = z.this;
            return c0Var.d(new er.l() { // from class: re2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.e.O(zVar, loadConfigurationError, (d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.LoadConfigurationError loadConfigurationError, k10.c0<re2.d> c0Var, tq.e<? super k10.l<? extends re2.e>> eVar) {
            e eVar2 = z.this.new e(eVar);
            eVar2.f173581f = loadConfigurationError;
            eVar2.f173582g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lre2/a$q;", "action", "Lk10/c0;", "Lre2/e$a$b;", "state", "Lk10/l;", "Lre2/e;", "<anonymous>", "(Lre2/a$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<re2.a.UpdateThumbnails, k10.c0<re2.e.a.Screen>, tq.e<? super k10.l<? extends re2.e>>, Object> {
        int A;
        int B;
        int C;
        int D;
        /* synthetic */ Object E;
        /* synthetic */ Object F;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f173584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f173585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f173586g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f173587h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f173588j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f173589k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f173590l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f173591m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f173592n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f173593p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f173594q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f173595r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f173596s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f173597t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f173598v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f173599w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f173600x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f173601y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f173602z;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final re2.e.a.Screen O(k10.c0 c0Var, List list, re2.e.a.Screen screen) {
            return screen.b(InitializedData.b(((re2.e.a.Screen) c0Var.a()).getInitializedData(), list, null, null, 6, null));
        }

        /* JADX WARN: Code duplicated, block: B:114:0x0198 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0176 A[Catch: Exception -> 0x019e, c -> 0x01a1, CancellationException -> 0x01a6, TryCatch #7 {c -> 0x01a1, CancellationException -> 0x01a6, Exception -> 0x019e, blocks: (B:76:0x0355, B:30:0x014c, B:32:0x0152, B:33:0x0170, B:35:0x0176, B:46:0x01b1, B:48:0x01b7, B:77:0x0363), top: B:111:0x0355 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x0199 A[LOOP:0: B:33:0x0170->B:38:0x0199, LOOP_END] */
        /* JADX WARN: Not initialized variable reg: 22, insn: 0x007d: MOVE (r10 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:10:0x007d */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0255 -> B:64:0x0314). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x02e8 -> B:63:0x02f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0349 -> B:66:0x0332). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r30) {
            /*
                Method dump skipped, instruction units count: 997
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: re2.z.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.UpdateThumbnails updateThumbnails, k10.c0<re2.e.a.Screen> c0Var, tq.e<? super k10.l<? extends re2.e>> eVar) {
            f fVar = z.this.new f(eVar);
            fVar.E = updateThumbnails;
            fVar.F = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lre2/a$b;", "action", "Lre2/e$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lre2/a$b;Lre2/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<re2.a.DeletePhoto, re2.e.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173604f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            re2.a.DeletePhoto deletePhoto = (re2.a.DeletePhoto) this.f173604f;
            uq.b.e();
            if (this.f173603e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.setupContract.s7(deletePhoto.getImage());
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.DeletePhoto deletePhoto, re2.e.a.Screen screen, tq.e<? super oq.i0> eVar) {
            g gVar = z.this.new g(eVar);
            gVar.f173604f = deletePhoto;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lre2/a$m;", "action", "Lre2/e$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lre2/a$m;Lre2/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<re2.a.OnShowImagePreview, re2.e.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f173606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f173607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f173608g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f173609h;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            re2.a.OnShowImagePreview onShowImagePreview = (re2.a.OnShowImagePreview) this.f173609h;
            Object objE = uq.b.e();
            int i15 = this.f173608g;
            if (i15 == 0) {
                oq.u.b(obj);
                oq.r<Photo, ImageAttachments> rVarL0 = z.this.setupContract.l0(onShowImagePreview.getThumbnail());
                if (rVarL0 == null) {
                    return oq.i0.f148189a;
                }
                dx3.a.Content content = new dx3.a.Content(onShowImagePreview.getImageTitle(), rVarL0.c().getFile().getFileContent());
                z zVar = z.this;
                re2.a.f.ShowImagePreview showImagePreview = new re2.a.f.ShowImagePreview(content);
                this.f173609h = vq.j.a(onShowImagePreview);
                this.f173606e = vq.j.a(rVarL0);
                this.f173607f = vq.j.a(content);
                this.f173608g = 1;
                if (zVar.F(showImagePreview, this) == objE) {
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
        public final Object w(re2.a.OnShowImagePreview onShowImagePreview, re2.e.a.Screen screen, tq.e<? super oq.i0> eVar) {
            h hVar = z.this.new h(eVar);
            hVar.f173609h = onShowImagePreview;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lre2/a$k;", "action", "Lre2/e$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lre2/a$k;Lre2/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<re2.a.OnFilePickerError, re2.e.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173612f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            re2.a.OnFilePickerError onFilePickerError = (re2.a.OnFilePickerError) this.f173612f;
            uq.b.e();
            if (this.f173611e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.b.Business domainError = onFilePickerError.getDomainError();
            if (domainError == null) {
                domainError = new dx.b.Business(null, null, z.this.labelProvider.c(ud2.a.f197751o), null, null, z.this.labelProvider.c(ud2.a.f197735g), null, 91, null);
            }
            DialogData dialogDataB = z.this.filePickerBusinessErrorMapper.b(new se2.b.Params(domainError, z.this.b9(re2.a.c.f173463a), z.this.b9(re2.a.j.f173472a)));
            if (dialogDataB != null) {
                z.this.d9(new re2.a.ShowDialog(dialogDataB));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.OnFilePickerError onFilePickerError, re2.e.a.Screen screen, tq.e<? super oq.i0> eVar) {
            i iVar = z.this.new i(eVar);
            iVar.f173612f = onFilePickerError;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lre2/e$a$b;", "it", "Loq/i0;", "<anonymous>", "(Lre2/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<re2.e.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173614e;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f173614e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z zVar = z.this;
            List<oq.r<Photo, ImageAttachments>> listC0 = zVar.setupContract.c0();
            ArrayList arrayList = new ArrayList(pq.v.y(listC0, 10));
            Iterator<T> it = listC0.iterator();
            while (it.hasNext()) {
                arrayList.add((Photo) ((oq.r) it.next()).a());
            }
            zVar.d9(new re2.a.UpdateThumbnails(arrayList));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(re2.e.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return ((j) v(screen, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new j(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lzd2/d;", "photos", "Lre2/e$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljava/util/List;Lre2/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<List<? extends Photo>, re2.e.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173617f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List list = (List) this.f173617f;
            uq.b.e();
            if (this.f173616e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(new re2.a.UpdateThumbnails(list));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(List<Photo> list, re2.e.a.Screen screen, tq.e<? super oq.i0> eVar) {
            k kVar = z.this.new k(eVar);
            kVar.f173617f = list;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lre2/a$o;", "action", "Lk10/c0;", "Lre2/e$a$b;", "state", "Lk10/l;", "Lre2/e;", "<anonymous>", "(Lre2/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<re2.a.ShowDialog, k10.c0<re2.e.a.Screen>, tq.e<? super k10.l<? extends re2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f173621g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final re2.e.a.Dialog O(k10.c0 c0Var, z zVar, re2.a.ShowDialog showDialog, re2.e.a.Screen screen) {
            return new re2.e.a.Dialog(((re2.e.a.Screen) c0Var.a()).getInitializedData(), zVar.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final re2.a.ShowDialog showDialog = (re2.a.ShowDialog) this.f173620f;
            final k10.c0 c0Var = (k10.c0) this.f173621g;
            uq.b.e();
            if (this.f173619e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final z zVar = z.this;
            return c0Var.d(new er.l() { // from class: re2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.l.O(c0Var, zVar, showDialog, (e.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.ShowDialog showDialog, k10.c0<re2.e.a.Screen> c0Var, tq.e<? super k10.l<? extends re2.e>> eVar) {
            l lVar = z.this.new l(eVar);
            lVar.f173620f = showDialog;
            lVar.f173621g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lre2/a$l;", "<unused var>", "Lre2/e$a$b;", "Loq/i0;", "<anonymous>", "(Lre2/a$l;Lre2/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<re2.a.l, re2.e.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173623e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173623e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                re2.a.f.b bVar = re2.a.f.b.f173467a;
                this.f173623e = 1;
                if (zVar.F(bVar, this) == objE) {
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
        public final Object w(re2.a.l lVar, re2.e.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return z.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lre2/a$g;", "<unused var>", "Lk10/c0;", "Lre2/e$a$b;", "state", "Lk10/l;", "Lre2/e;", "<anonymous>", "(Lre2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<re2.a.g, k10.c0<re2.e.a.Screen>, tq.e<? super k10.l<? extends re2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173626f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final re2.e.a.Screen O(k10.c0 c0Var, re2.e.a.Screen screen) {
            return screen.b(InitializedData.b(((re2.e.a.Screen) c0Var.a()).getInitializedData(), null, null, g30.v.EXPANDED, 3, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f173626f;
            uq.b.e();
            if (this.f173625e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: re2.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.n.O(c0Var, (e.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.g gVar, k10.c0<re2.e.a.Screen> c0Var, tq.e<? super k10.l<? extends re2.e>> eVar) {
            n nVar = new n(eVar);
            nVar.f173626f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lre2/a$d;", "<unused var>", "Lk10/c0;", "Lre2/e$a$b;", "state", "Lk10/l;", "Lre2/e;", "<anonymous>", "(Lre2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<re2.a.d, k10.c0<re2.e.a.Screen>, tq.e<? super k10.l<? extends re2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173628f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final re2.e.a.Screen O(k10.c0 c0Var, re2.e.a.Screen screen) {
            return screen.b(InitializedData.b(((re2.e.a.Screen) c0Var.a()).getInitializedData(), null, null, g30.v.HIDDEN, 3, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f173628f;
            uq.b.e();
            if (this.f173627e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: re2.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.o.O(c0Var, (e.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.d dVar, k10.c0<re2.e.a.Screen> c0Var, tq.e<? super k10.l<? extends re2.e>> eVar) {
            o oVar = new o(eVar);
            oVar.f173628f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lre2/a$a;", "<unused var>", "Lre2/e$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lre2/a$a;Lre2/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<re2.a.C4427a, re2.e.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173630f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f173632e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f173633f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f173634g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f173635h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f173636j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ z f173637k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ re2.e.a.Screen f173638l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, re2.e.a.Screen screen, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f173637k = zVar;
                this.f173638l = screen;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
            
                if (r1.R9(r3, r6) == r0) goto L24;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
                /*
                    r6 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r6.f173636j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r6.f173633f
                    java.util.List r0 = (java.util.List) r0
                    java.lang.Object r0 = r6.f173632e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r7)
                    goto La9
                L1b:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L23:
                    oq.u.b(r7)
                    goto L61
                L27:
                    oq.u.b(r7)
                    re2.z r7 = r6.f173637k
                    re2.a$d r1 = re2.a.d.f173464a
                    re2.z.r9(r7, r1)
                    re2.z r7 = r6.f173637k
                    ae2.e r7 = re2.z.E9(r7)
                    ae2.e$a r1 = new ae2.e$a
                    re2.e$a$b r4 = r6.f173638l
                    re2.b r4 = r4.getInitializedData()
                    zp0.e r4 = r4.getFileImageConfiguration()
                    int r4 = r4.getImageMaxSide()
                    re2.e$a$b r5 = r6.f173638l
                    re2.b r5 = r5.getInitializedData()
                    zp0.e r5 = r5.getFileImageConfiguration()
                    int r5 = r5.getQuality()
                    r1.<init>(r4, r5)
                    r6.f173636j = r3
                    java.lang.Object r7 = r7.c(r1, r6)
                    if (r7 != r0) goto L61
                    goto La8
                L61:
                    dx.i r7 = (dx.i) r7
                    re2.z r1 = r6.f173637k
                    boolean r3 = r7 instanceof dx.i.Left
                    if (r3 == 0) goto L82
                    dx.i$b r7 = (dx.i.Left) r7
                    java.lang.Object r7 = r7.b()
                    dx.b r7 = (dx.b) r7
                    re2.a$k r0 = new re2.a$k
                    boolean r2 = r7 instanceof dx.b.Business
                    if (r2 == 0) goto L7a
                    dx.b$c r7 = (dx.b.Business) r7
                    goto L7b
                L7a:
                    r7 = 0
                L7b:
                    r0.<init>(r7)
                    re2.z.r9(r1, r0)
                    goto La9
                L82:
                    boolean r3 = r7 instanceof dx.i.Right
                    if (r3 == 0) goto Lac
                    r3 = r7
                    dx.i$c r3 = (dx.i.Right) r3
                    java.lang.Object r3 = r3.b()
                    java.util.List r3 = (java.util.List) r3
                    java.lang.Object r7 = vq.j.a(r7)
                    r6.f173632e = r7
                    java.lang.Object r7 = vq.j.a(r3)
                    r6.f173633f = r7
                    r7 = 0
                    r6.f173634g = r7
                    r6.f173635h = r7
                    r6.f173636j = r2
                    java.lang.Object r7 = re2.z.I9(r1, r3, r6)
                    if (r7 != r0) goto La9
                La8:
                    return r0
                La9:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                Lac:
                    oq.p r7 = new oq.p
                    r7.<init>()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: re2.z.p.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f173637k, this.f173638l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            re2.e.a.Screen screen = (re2.e.a.Screen) this.f173630f;
            Object objE = uq.b.e();
            int i15 = this.f173629e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = z.this.callActionWithLoaderUseCase;
                a aVar2 = new a(z.this, screen, null);
                this.f173630f = vq.j.a(screen);
                this.f173629e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(re2.a.C4427a c4427a, re2.e.a.Screen screen, tq.e<? super oq.i0> eVar) {
            p pVar = z.this.new p(eVar);
            pVar.f173630f = screen;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lre2/a$p;", "<unused var>", "Lre2/e$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lre2/a$p;Lre2/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<re2.a.p, re2.e.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173640f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f173642e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f173643f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f173644g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f173645h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f173646j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f173647k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f173648l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f173649m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f173650n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f173651p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f173652q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ z f173653r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ re2.e.a.Screen f173654s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, re2.e.a.Screen screen, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f173653r = zVar;
                this.f173654s = screen;
            }

            /* JADX WARN: Code duplicated, block: B:49:0x0158  */
            /* JADX WARN: Code duplicated, block: B:52:0x0169  */
            /* JADX WARN: Code duplicated, block: B:53:0x0177  */
            /* JADX WARN: Code duplicated, block: B:55:0x017b  */
            /* JADX WARN: Code duplicated, block: B:59:0x018c  */
            /* JADX WARN: Code duplicated, block: B:61:0x019a  */
            /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v1, types: [dx.j, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v14 */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                String message;
                dx.i iVarA;
                Object objB;
                dx.i left;
                z zVar;
                z zVar2;
                dx.j<dx.b> jVarA;
                int i15;
                int i16;
                int i17;
                ex.b bVar;
                ex.b bVar2;
                ex.b bVar3;
                int i18;
                int i19;
                ?? E = uq.b.e();
                int i25 = this.f173652q;
                try {
                    try {
                        if (i25 == 0) {
                            oq.u.b(obj);
                            this.f173653r.d9(re2.a.d.f173464a);
                            zVar2 = this.f173653r;
                            re2.e.a.Screen screen = this.f173654s;
                            jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                ae2.c cVar = zVar2.pickIncidentPhotoFromCameraWithAttachmentsUC;
                                ae2.c.Params params = new ae2.c.Params(zVar2.dateFormatter.d(new fz.b.LocalDateTime(zVar2.currentTimeProvider.i()), fz.c.NO_SPACES), vq.b.e(screen.getInitializedData().getFileImageConfiguration().getImageMaxSide()), vq.b.e(screen.getInitializedData().getFileImageConfiguration().getQuality()));
                                this.f173642e = zVar2;
                                this.f173643f = jVarA;
                                this.f173644g = vq.j.a(aVar);
                                this.f173645h = vq.j.a(aVar);
                                this.f173646j = aVar;
                                this.f173647k = 0;
                                this.f173648l = 0;
                                this.f173649m = 0;
                                this.f173650n = 0;
                                this.f173651p = 0;
                                this.f173652q = 1;
                                Object objC = cVar.c(params, this);
                                if (objC != E) {
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    bVar = aVar;
                                    bVar2 = bVar;
                                    bVar3 = bVar2;
                                    i18 = 0;
                                    obj = objC;
                                    i19 = 0;
                                }
                                return E;
                            } catch (ex.c e15) {
                                e = e15;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                E = jVarA;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(E));
                                iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                            }
                        } else {
                            if (i25 != 1) {
                                if (i25 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                try {
                                    oq.u.b(obj);
                                    left = new dx.i.Right((dx.i) obj);
                                } catch (ex.c e18) {
                                    e = e18;
                                    left = new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                }
                                zVar = this.f173653r;
                                if (left instanceof dx.i.Left) {
                                    dx.b bVar4 = (dx.b) ((dx.i.Left) left).b();
                                    zVar.d9(new re2.a.OnFilePickerError(bVar4 instanceof dx.b.Business ? (dx.b.Business) bVar4 : null));
                                }
                                return oq.i0.f148189a;
                            }
                            int i26 = this.f173651p;
                            int i27 = this.f173650n;
                            int i28 = this.f173649m;
                            int i29 = this.f173648l;
                            int i35 = this.f173647k;
                            ex.b bVar5 = (ex.b) this.f173646j;
                            ex.b bVar6 = (ex.b) this.f173645h;
                            ex.b bVar7 = (ex.b) this.f173644g;
                            dx.j<dx.b> jVar = (dx.j) this.f173643f;
                            zVar2 = (z) this.f173642e;
                            try {
                                oq.u.b(obj);
                                i19 = i26;
                                jVarA = jVar;
                                bVar3 = bVar7;
                                bVar2 = bVar6;
                                bVar = bVar5;
                                i18 = i35;
                                i17 = i29;
                                i16 = i28;
                                i15 = i27;
                            } catch (ex.c e25) {
                                e = e25;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e26) {
                                throw e26;
                            } catch (Exception e27) {
                                e = e27;
                                E = jVar;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(E));
                                iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                            }
                        }
                        List listE = pq.v.e(((ae2.c.Result) bVar.a((dx.i) obj)).a());
                        this.f173642e = jVarA;
                        this.f173643f = vq.j.a(bVar3);
                        this.f173644g = vq.j.a(bVar2);
                        this.f173645h = vq.j.a(listE);
                        this.f173646j = null;
                        this.f173647k = i18;
                        this.f173648l = i17;
                        this.f173649m = i16;
                        this.f173650n = i15;
                        this.f173651p = i19;
                        this.f173652q = 2;
                        obj = zVar2.R9(listE, this);
                        if (obj != E) {
                            left = new dx.i.Right((dx.i) obj);
                            zVar = this.f173653r;
                            if (left instanceof dx.i.Left) {
                                dx.b bVar8 = (dx.b) ((dx.i.Left) left).b();
                                zVar.d9(new re2.a.OnFilePickerError(bVar8 instanceof dx.b.Business ? (dx.b.Business) bVar8 : null));
                            }
                            return oq.i0.f148189a;
                        }
                        return E;
                    } catch (CancellationException e28) {
                        throw e28;
                    }
                } catch (Exception e29) {
                    e = e29;
                }
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f173653r, this.f173654s, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            re2.e.a.Screen screen = (re2.e.a.Screen) this.f173640f;
            Object objE = uq.b.e();
            int i15 = this.f173639e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = z.this.callActionWithLoaderUseCase;
                a aVar2 = new a(z.this, screen, null);
                this.f173640f = vq.j.a(screen);
                this.f173639e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(re2.a.p pVar, re2.e.a.Screen screen, tq.e<? super oq.i0> eVar) {
            q qVar = z.this.new q(eVar);
            qVar.f173640f = screen;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lre2/a$i;", "action", "Lk10/c0;", "Lre2/e$a$b;", "state", "Lk10/l;", "Lre2/e;", "<anonymous>", "(Lre2/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<re2.a.OnBottomSheetStateChanged, k10.c0<re2.e.a.Screen>, tq.e<? super k10.l<? extends re2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f173657g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final re2.e.a.Screen O(k10.c0 c0Var, re2.a.OnBottomSheetStateChanged onBottomSheetStateChanged, re2.e.a.Screen screen) {
            return screen.b(InitializedData.b(((re2.e.a.Screen) c0Var.a()).getInitializedData(), null, null, onBottomSheetStateChanged.getState(), 3, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final re2.a.OnBottomSheetStateChanged onBottomSheetStateChanged = (re2.a.OnBottomSheetStateChanged) this.f173656f;
            final k10.c0 c0Var = (k10.c0) this.f173657g;
            uq.b.e();
            if (this.f173655e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: re2.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.r.O(c0Var, onBottomSheetStateChanged, (e.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0<re2.e.a.Screen> c0Var, tq.e<? super k10.l<? extends re2.e>> eVar) {
            r rVar = new r(eVar);
            rVar.f173656f = onBottomSheetStateChanged;
            rVar.f173657g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lre2/a$j;", "<unused var>", "Lk10/c0;", "Lre2/e$a$a;", "state", "Lk10/l;", "Lre2/e;", "<anonymous>", "(Lre2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<re2.a.j, k10.c0<re2.e.a.Dialog>, tq.e<? super k10.l<? extends re2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173659f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final re2.e.a.Screen O(k10.c0 c0Var, re2.e.a.Dialog dialog) {
            return new re2.e.a.Screen(((re2.e.a.Dialog) c0Var.a()).getInitializedData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f173659f;
            uq.b.e();
            if (this.f173658e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: re2.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.s.O(c0Var, (e.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.j jVar, k10.c0<re2.e.a.Dialog> c0Var, tq.e<? super k10.l<? extends re2.e>> eVar) {
            s sVar = new s(eVar);
            sVar.f173659f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lre2/a$c;", "<unused var>", "Lre2/e$a$a;", "Loq/i0;", "<anonymous>", "(Lre2/a$c;Lre2/e$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<re2.a.c, re2.e.a.Dialog, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173660e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f173660e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.c cVar, re2.e.a.Dialog dialog, tq.e<? super oq.i0> eVar) {
            return z.this.new t(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lre2/a$n;", "<unused var>", "Lk10/c0;", "Lre2/c;", "state", "Lk10/l;", "Lre2/e;", "<anonymous>", "(Lre2/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<re2.a.n, k10.c0<Error>, tq.e<? super k10.l<? extends re2.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173663f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final re2.d O(Error error) {
            return re2.d.f173491a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f173663f;
            uq.b.e();
            if (this.f173662e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: re2.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.u.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(re2.a.n nVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends re2.e>> eVar) {
            u uVar = new u(eVar);
            uVar.f173663f = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    public z(yy.a aVar, se2.e eVar, hb4.d dVar, ib4.c cVar, aq0.b bVar, ac4.a aVar2, a14.m mVar, yw.b bVar2, mx.c cVar2, se2.b bVar3, se2.a aVar3, ae2.c cVar3, bc4.e eVar2, ez.e eVar3, ez.a aVar4, cb4.j jVar, ae2.e eVar4, b00.c cVar4, re2.g gVar) {
        this.mapper = eVar;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar;
        this.beGetReportIncidentTypesUC = bVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.accessibilityTalkBackManager = bVar2;
        this.labelProvider = cVar2;
        this.filePickerBusinessErrorMapper = bVar3;
        this.duplicatePhotoDialogMapper = aVar3;
        this.pickIncidentPhotoFromCameraWithAttachmentsUC = cVar3;
        this.createThumbnailUseCase = eVar2;
        this.dateFormatter = eVar3;
        this.currentTimeProvider = aVar4;
        this.dialogVMSFactory = jVar;
        this.pickPhotoWithAttachmentsExifFromGalleryUC = eVar4;
        this.imageConverter = cVar4;
        this.setupContract = gVar;
        re2.d dVar2 = re2.d.f173491a;
        this.initialState = dVar2;
        this.stateMachine = aVar.a(dVar2, new er.l() { // from class: re2.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.T9(this.f173535a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), L9(dVar2));
    }

    private final boolean K9(String uri) {
        List<oq.r<Photo, ImageAttachments>> listC0 = this.setupContract.c0();
        if ((listC0 instanceof Collection) && listC0.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC0.iterator();
        while (it.hasNext()) {
            if (fr.t.c(((Photo) ((oq.r) it.next()).c()).getFile().getMetadata().getUri(), uri)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final re2.f.a L9(re2.e state) {
        return this.mapper.b(new se2.e.Params(state, b9(re2.a.h.f173470a), b9(re2.a.l.f173475a), b9(re2.a.g.f173469a), b9(re2.a.C4427a.f173461a), b9(re2.a.p.f173480a), new er.l() { // from class: re2.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.M9(this.f173531a, (o04.c) obj);
            }
        }, new er.l() { // from class: re2.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.N9(this.f173532a, (g30.v) obj);
            }
        }, new er.p() { // from class: re2.w
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return z.O9(this.f173533a, (Label) obj, (o04.c) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(z zVar, o04.c cVar) {
        zVar.d9(new re2.a.DeletePhoto(cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(z zVar, g30.v vVar) {
        zVar.d9(new re2.a.OnBottomSheetStateChanged(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(z zVar, Label label, o04.c cVar) {
        zVar.d9(new re2.a.OnShowImagePreview(label, cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b P9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: re2.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.Q9(this.f173534a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(z zVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            zVar.d9(re2.a.h.f173470a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            zVar.d9(re2.a.n.f173478a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object R9(List<oq.r<wx.i.Image, ImageAttachments>> list, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
        Object objB;
        Object left;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        oq.r rVar = (oq.r) it.next();
                        wx.i.Image image = (wx.i.Image) rVar.a();
                        ImageAttachments imageAttachments = (ImageAttachments) rVar.b();
                        if (K9(image.getMetadata().getUri())) {
                            d9(new re2.a.ShowDialog(this.duplicatePhotoDialogMapper.b(new se2.a.Params(b9(re2.a.j.f173472a)))));
                            break;
                        }
                        this.setupContract.i6(image, imageAttachments);
                        this.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
                    }
                    left = new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            left = new dx.i.Left(objB);
        }
        if (left instanceof dx.i.Left) {
            d9(new re2.a.OnFilePickerError(null, 1, null));
        }
        return left;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(re2.e.class), new er.l() { // from class: re2.p
            @Override // er.l
            public final Object b(Object obj) {
                return z.U9(this.f173527a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(re2.d.class), new er.l() { // from class: re2.q
            @Override // er.l
            public final Object b(Object obj) {
                return z.V9(this.f173528a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(re2.e.a.Screen.class), new er.l() { // from class: re2.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.W9(this.f173529a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(re2.e.a.Dialog.class), new er.l() { // from class: re2.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.X9(this.f173530a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: re2.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.Y9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(z zVar, k10.z zVar2) {
        b bVar = zVar.new b(null);
        zVar2.x(q0.c(re2.a.h.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(z zVar, k10.z zVar2) {
        zVar2.C(zVar.new c(null));
        d dVar = zVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(re2.a.n.class), oVar, dVar);
        zVar2.v(q0.c(re2.a.LoadConfigurationError.class), oVar, zVar.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(z zVar, k10.z zVar2) {
        zVar2.C(zVar.new j(null));
        k10.k.s(zVar2, zVar.setupContract.V1(), null, zVar.new k(null), 2, null);
        l lVar = zVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(re2.a.ShowDialog.class), oVar, lVar);
        zVar2.x(q0.c(re2.a.l.class), oVar, zVar.new m(null));
        zVar2.v(q0.c(re2.a.g.class), oVar, new n(null));
        zVar2.v(q0.c(re2.a.d.class), oVar, new o(null));
        zVar2.x(q0.c(re2.a.C4427a.class), oVar, zVar.new p(null));
        zVar2.x(q0.c(re2.a.p.class), oVar, zVar.new q(null));
        zVar2.v(q0.c(re2.a.OnBottomSheetStateChanged.class), oVar, new r(null));
        zVar2.v(q0.c(re2.a.UpdateThumbnails.class), oVar, zVar.new f(null));
        zVar2.x(q0.c(re2.a.DeletePhoto.class), oVar, zVar.new g(null));
        zVar2.x(q0.c(re2.a.OnShowImagePreview.class), oVar, zVar.new h(null));
        zVar2.x(q0.c(re2.a.OnFilePickerError.class), oVar, zVar.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(z zVar, k10.z zVar2) {
        s sVar = new s(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(re2.a.j.class), oVar, sVar);
        zVar2.x(q0.c(re2.a.c.class), oVar, zVar.new t(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(k10.z zVar) {
        u uVar = new u(null);
        zVar.v(q0.c(re2.a.n.class), k10.o.CANCEL_PREVIOUS, uVar);
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(re2.a.f fVar, tq.e<? super oq.i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: S9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(re2.g gVar) {
        super.P5(gVar);
    }

    @Override // zx.b
    public xw.b<re2.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<re2.e, re2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<re2.f.a> getState() {
        return this.state;
    }
}
