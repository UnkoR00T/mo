package oy1;

import jb4.ErrorActionData;
import lw1.j0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Loy1/v;", "Lxw/f;", "Loy1/v$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "errorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "params", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Loy1/v$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements xw.f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: oy1.v$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b&\u0010%R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b\"\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u001b\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b)\u0010%¨\u0006*"}, d2 = {"Loy1/v$a;", "", "Lpy1/b;", "errorType", "Lyw1/a;", "certificateType", "Lkotlin/Function0;", "Loq/i0;", "goToCanScreenAction", "goToPukScreenAction", "Lkotlin/Function1;", "Lpy1/c;", "endProcessAction", "cancelAction", "onRetryAction", "<init>", "(Lpy1/b;Lyw1/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpy1/b;", "d", "()Lpy1/b;", "b", "Lyw1/a;", "()Lyw1/a;", "c", "Ler/a;", "e", "()Ler/a;", "f", "Ler/l;", "()Ler/l;", "g", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final py1.b errorType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final yw1.a certificateType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToCanScreenAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToPukScreenAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<py1.c, i0> endProcessAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> cancelAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRetryAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(py1.b bVar, yw1.a aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.l<? super py1.c, i0> lVar, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.errorType = bVar;
            this.certificateType = aVar;
            this.goToCanScreenAction = aVar2;
            this.goToPukScreenAction = aVar3;
            this.endProcessAction = lVar;
            this.cancelAction = aVar4;
            this.onRetryAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.cancelAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final yw1.a getCertificateType() {
            return this.certificateType;
        }

        public final er.l<py1.c, i0> c() {
            return this.endProcessAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final py1.b getErrorType() {
            return this.errorType;
        }

        public final er.a<i0> e() {
            return this.goToCanScreenAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.errorType, params.errorType) && this.certificateType == params.certificateType && fr.t.c(this.goToCanScreenAction, params.goToCanScreenAction) && fr.t.c(this.goToPukScreenAction, params.goToPukScreenAction) && fr.t.c(this.endProcessAction, params.endProcessAction) && fr.t.c(this.cancelAction, params.cancelAction) && fr.t.c(this.onRetryAction, params.onRetryAction);
        }

        public final er.a<i0> f() {
            return this.goToPukScreenAction;
        }

        public final er.a<i0> g() {
            return this.onRetryAction;
        }

        public int hashCode() {
            return (((((((((((this.errorType.hashCode() * 31) + this.certificateType.hashCode()) * 31) + this.goToCanScreenAction.hashCode()) * 31) + this.goToPukScreenAction.hashCode()) * 31) + this.endProcessAction.hashCode()) * 31) + this.cancelAction.hashCode()) * 31) + this.onRetryAction.hashCode();
        }

        public String toString() {
            return "Params(errorType=" + this.errorType + ", certificateType=" + this.certificateType + ", goToCanScreenAction=" + this.goToCanScreenAction + ", goToPukScreenAction=" + this.goToPukScreenAction + ", endProcessAction=" + this.endProcessAction + ", cancelAction=" + this.cancelAction + ", onRetryAction=" + this.onRetryAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150660a;

        static {
            int[] iArr = new int[yw1.a.values().length];
            try {
                iArr[yw1.a.AUTHENTICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yw1.a.AUTHORIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f150660a = iArr;
        }
    }

    public v(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.errorMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(Params params) {
        params.c().b(py1.c.a.f163246a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(Params params) {
        params.c().b(py1.c.a.f163246a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(Params params) {
        params.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(Params params, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a)) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                params.g().a();
            } else {
                if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                params.a().a();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(Params params) {
        params.c().b(py1.c.a.f163246a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(Params params) {
        params.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c0(Params params) {
        params.c().b(py1.c.a.f163246a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(Params params) {
        params.f().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(Params params) {
        params.c().b(py1.c.a.f163246a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f0(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        int i15;
        int i16;
        int i17;
        int i18;
        py1.b errorType = params.getErrorType();
        if (errorType == py1.b.EnumC4043b.GENERIC_ERROR) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120735i), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.a
                @Override // er.a
                public final Object a() {
                    return v.M(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.c
                @Override // er.a
                public final Object a() {
                    return v.N(params);
                }
            }), 54, null);
        }
        if (errorType == py1.b.EnumC4043b.WRONG_CAN) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120724f3), null, null, new ErrorActionData(this.labelProvider.c(j0.f120796v), new er.a() { // from class: oy1.e
                @Override // er.a
                public final Object a() {
                    return v.Y(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.f
                @Override // er.a
                public final Object a() {
                    return v.a0(params);
                }
            }), 54, null);
        }
        if (errorType == py1.b.EnumC4043b.WRONG_PUK_2_TRIES_LEFT) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120739i3), this.labelProvider.c(j0.f120734h3), null, new ErrorActionData(this.labelProvider.c(j0.f120796v), new er.a() { // from class: oy1.g
                @Override // er.a
                public final Object a() {
                    return v.b0(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.h
                @Override // er.a
                public final Object a() {
                    return v.c0(params);
                }
            }), 52, null);
        }
        if (errorType == py1.b.EnumC4043b.WRONG_PUK_1_TRY_LEFT) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120739i3), this.labelProvider.c(j0.f120729g3), null, new ErrorActionData(this.labelProvider.c(j0.f120796v), new er.a() { // from class: oy1.i
                @Override // er.a
                public final Object a() {
                    return v.d0(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.j
                @Override // er.a
                public final Object a() {
                    return v.e0(params);
                }
            }), 52, null);
        }
        if (errorType == py1.b.EnumC4043b.PUK_BLOCKED) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120749k3), this.labelProvider.c(j0.f120744j3), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.k
                @Override // er.a
                public final Object a() {
                    return v.f0(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.m
                @Override // er.a
                public final Object a() {
                    return v.g0(params);
                }
            }), 52, null);
        }
        if (errorType == py1.b.EnumC4043b.CERTIFICATE_INACTIVE) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120759m3), this.labelProvider.c(j0.f120754l3), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.l
                @Override // er.a
                public final Object a() {
                    return v.O(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.n
                @Override // er.a
                public final Object a() {
                    return v.P(params);
                }
            }), 52, null);
        }
        if (errorType == py1.b.EnumC4043b.CERTIFICATE_MISSING) {
            mx.c cVar = this.labelProvider;
            yw1.a certificateType = params.getCertificateType();
            int[] iArr = b.f150660a;
            int i19 = iArr[certificateType.ordinal()];
            if (i19 == 1) {
                i17 = j0.f120811y2;
            } else {
                if (i19 != 2) {
                    throw new oq.p();
                }
                i17 = j0.f120769o3;
            }
            Label labelC = cVar.c(i17);
            mx.c cVar2 = this.labelProvider;
            int i25 = iArr[params.getCertificateType().ordinal()];
            if (i25 == 1) {
                i18 = j0.f120807x2;
            } else {
                if (i25 != 2) {
                    throw new oq.p();
                }
                i18 = j0.f120764n3;
            }
            return new jb4.b.Failure(labelC, cVar2.c(i18), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.o
                @Override // er.a
                public final Object a() {
                    return v.Q(params);
                }
            }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.p
                @Override // er.a
                public final Object a() {
                    return v.R(params);
                }
            }), 52, null);
        }
        if (errorType != py1.b.EnumC4043b.DATA_MISSING) {
            if (errorType == py1.b.EnumC4043b.TECHNICAL_ERROR) {
                return new jb4.b.Failure(this.labelProvider.c(j0.f120735i), null, null, new ErrorActionData(this.labelProvider.c(j0.f120788t), new er.a() { // from class: oy1.s
                    @Override // er.a
                    public final Object a() {
                        return v.U(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.t
                    @Override // er.a
                    public final Object a() {
                        return v.V(params);
                    }
                }), 54, null);
            }
            if (errorType == py1.b.EnumC4043b.DATA_INCONSISTENCY) {
                return new jb4.b.Warning(this.labelProvider.c(j0.f120809y0), this.labelProvider.c(j0.f120801w0), null, new ErrorActionData(this.labelProvider.c(j0.f120788t), new er.a() { // from class: oy1.u
                    @Override // er.a
                    public final Object a() {
                        return v.W(params);
                    }
                }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.b
                    @Override // er.a
                    public final Object a() {
                        return v.X(params);
                    }
                }), 52, null);
            }
            if (errorType instanceof py1.b.GenericError) {
                return this.errorMapper.b(new ib4.c.Params(((py1.b.GenericError) errorType).getDomainError(), false, new er.l() { // from class: oy1.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return v.Z(params, (ib4.c.b) obj);
                    }
                }, 2, null));
            }
            throw new oq.p();
        }
        mx.c cVar3 = this.labelProvider;
        yw1.a certificateType2 = params.getCertificateType();
        int[] iArr2 = b.f150660a;
        int i26 = iArr2[certificateType2.ordinal()];
        if (i26 == 1) {
            i15 = j0.f120811y2;
        } else {
            if (i26 != 2) {
                throw new oq.p();
            }
            i15 = j0.f120769o3;
        }
        Label labelC2 = cVar3.c(i15);
        mx.c cVar4 = this.labelProvider;
        int i27 = iArr2[params.getCertificateType().ordinal()];
        if (i27 == 1) {
            i16 = j0.f120807x2;
        } else {
            if (i27 != 2) {
                throw new oq.p();
            }
            i16 = j0.f120764n3;
        }
        return new jb4.b.Failure(labelC2, cVar4.c(i16), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.q
            @Override // er.a
            public final Object a() {
                return v.S(params);
            }
        }), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), new er.a() { // from class: oy1.r
            @Override // er.a
            public final Object a() {
                return v.T(params);
            }
        }), 52, null);
    }
}
