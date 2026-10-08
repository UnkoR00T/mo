package zx1;

import er.l;
import fr.t;
import jb4.ErrorActionData;
import lw1.j0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzx1/d;", "Lxw/f;", "Lzx1/d$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "errorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "params", "i", "(Lzx1/d$a;)Ljb4/b;", "Ldx/b;", "domainError", "f", "(Ldx/b;Lzx1/d$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: zx1.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lzx1/d$a;", "", "Lay1/a;", "errorType", "Lkotlin/Function0;", "Loq/i0;", "goToCanScreenAction", "goToPinScreenAction", "cancelAction", "onRetryAction", "<init>", "(Lay1/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lay1/a;", "b", "()Lay1/a;", "Ler/a;", "c", "()Ler/a;", "d", "e", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ay1.a errorType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToCanScreenAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToPinScreenAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> cancelAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRetryAction;

        public Params(ay1.a aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.errorType = aVar;
            this.goToCanScreenAction = aVar2;
            this.goToPinScreenAction = aVar3;
            this.cancelAction = aVar4;
            this.onRetryAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.cancelAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ay1.a getErrorType() {
            return this.errorType;
        }

        public final er.a<i0> c() {
            return this.goToCanScreenAction;
        }

        public final er.a<i0> d() {
            return this.goToPinScreenAction;
        }

        public final er.a<i0> e() {
            return this.onRetryAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.errorType, params.errorType) && t.c(this.goToCanScreenAction, params.goToCanScreenAction) && t.c(this.goToPinScreenAction, params.goToPinScreenAction) && t.c(this.cancelAction, params.cancelAction) && t.c(this.onRetryAction, params.onRetryAction);
        }

        public int hashCode() {
            return (((((((this.errorType.hashCode() * 31) + this.goToCanScreenAction.hashCode()) * 31) + this.goToPinScreenAction.hashCode()) * 31) + this.cancelAction.hashCode()) * 31) + this.onRetryAction.hashCode();
        }

        public String toString() {
            return "Params(errorType=" + this.errorType + ", goToCanScreenAction=" + this.goToCanScreenAction + ", goToPinScreenAction=" + this.goToPinScreenAction + ", cancelAction=" + this.cancelAction + ", onRetryAction=" + this.onRetryAction + ')';
        }
    }

    public d(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.errorMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a)) {
            if (t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                params.e().a();
            } else {
                if (!t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new p();
                }
                params.a().a();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Primary) {
            params.e().a();
        } else {
            if (!(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.AbstractC2161b)) {
                throw new p();
            }
            params.a().a();
        }
        return i0.f148189a;
    }

    public final jb4.b f(dx.b domainError, final Params params) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new l() { // from class: zx1.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.h(params, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        ay1.a errorType = params.getErrorType();
        if (errorType == ay1.a.b.GENERIC_ERROR) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120735i), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), 54, null);
        }
        if (errorType == ay1.a.b.WRONG_CAN) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120724f3), null, null, new ErrorActionData(this.labelProvider.c(j0.f120796v), params.c()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), 54, null);
        }
        if (errorType == ay1.a.b.WRONG_PIN_2_TRIES_LEFT) {
            return new jb4.b.Failure(this.labelProvider.c(j0.F), this.labelProvider.c(j0.E), null, new ErrorActionData(this.labelProvider.c(j0.f120796v), params.d()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), 52, null);
        }
        if (errorType == ay1.a.b.WRONG_PIN_1_TRY_LEFT) {
            return new jb4.b.Failure(this.labelProvider.c(j0.F), this.labelProvider.c(j0.D), null, new ErrorActionData(this.labelProvider.c(j0.f120796v), params.d()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), 52, null);
        }
        if (errorType == ay1.a.b.PIN_BLOCKED) {
            return new jb4.b.Failure(this.labelProvider.c(j0.D1), this.labelProvider.c(j0.C1), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), 52, null);
        }
        if (errorType == ay1.a.b.CERTIFICATE_INACTIVE) {
            return new jb4.b.Failure(this.labelProvider.c(j0.F1), this.labelProvider.c(j0.E1), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), 52, null);
        }
        if (errorType != ay1.a.b.CERTIFICATE_MISSING && errorType != ay1.a.b.DATA_MISSING) {
            if (errorType == ay1.a.b.TECHNICAL_ERROR) {
                return new jb4.b.Failure(this.labelProvider.c(j0.f120735i), null, null, new ErrorActionData(this.labelProvider.c(j0.f120788t), params.a()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), 54, null);
            }
            if (!(errorType instanceof ay1.a.GenericError)) {
                throw new p();
            }
            dx.b domainError = ((ay1.a.GenericError) errorType).getDomainError();
            return domainError instanceof dx.b.Business ? this.errorMapper.b(new ib4.c.Params(domainError, false, new l() { // from class: zx1.c
                @Override // er.l
                public final Object b(Object obj) {
                    return d.l(params, (ib4.c.b) obj);
                }
            }, 2, null)) : f(domainError, params);
        }
        return new jb4.b.Failure(this.labelProvider.c(j0.H1), this.labelProvider.c(j0.G1), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.a()), 52, null);
    }
}
