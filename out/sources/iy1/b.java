package iy1;

import er.l;
import fr.t;
import jb4.ErrorActionData;
import lw1.j0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Liy1/b;", "Lxw/f;", "Liy1/b$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "errorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "params", "e", "(Liy1/b$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: iy1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Liy1/b$a;", "", "Liy1/c;", "errorType", "Lkotlin/Function0;", "Loq/i0;", "goToCanScreenAction", "onBackAction", "onCloseAction", "onRetryAction", "<init>", "(Liy1/c;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy1/c;", "()Liy1/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c errorType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToCanScreenAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRetryAction;

        public Params(c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.errorType = cVar;
            this.goToCanScreenAction = aVar;
            this.onBackAction = aVar2;
            this.onCloseAction = aVar3;
            this.onRetryAction = aVar4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getErrorType() {
            return this.errorType;
        }

        public final er.a<i0> b() {
            return this.goToCanScreenAction;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final er.a<i0> d() {
            return this.onCloseAction;
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
            return t.c(this.errorType, params.errorType) && t.c(this.goToCanScreenAction, params.goToCanScreenAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onRetryAction, params.onRetryAction);
        }

        public int hashCode() {
            return (((((((this.errorType.hashCode() * 31) + this.goToCanScreenAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onRetryAction.hashCode();
        }

        public String toString() {
            return "Params(errorType=" + this.errorType + ", goToCanScreenAction=" + this.goToCanScreenAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ", onRetryAction=" + this.onRetryAction + ')';
        }
    }

    public b(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.errorMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a)) {
            if (t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                params.e().a();
            } else {
                if (!t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new p();
                }
                params.d().a();
            }
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        c errorType = params.getErrorType();
        if (errorType == c.b.GENERIC_ERROR) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120735i), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), 54, null);
        }
        if (errorType == c.b.WRONG_CAN) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120724f3), null, null, new ErrorActionData(this.labelProvider.c(j0.f120796v), params.b()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), 54, null);
        }
        if (errorType == c.b.TIMEOUT) {
            return new jb4.b.Warning(this.labelProvider.c(j0.f120809y0), this.labelProvider.c(j0.f120805x0), null, new ErrorActionData(this.labelProvider.c(j0.f120788t), params.b()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), 52, null);
        }
        if (errorType == c.b.CERTIFICATE_INACTIVE) {
            return new jb4.b.Failure(this.labelProvider.c(j0.f120759m3), this.labelProvider.c(j0.f120754l3), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), 52, null);
        }
        if (errorType != c.b.CERTIFICATE_MISSING && errorType != c.b.DATA_MISSING) {
            if (errorType == c.b.TECHNICAL_ERROR) {
                return new jb4.b.Failure(this.labelProvider.c(j0.f120735i), null, null, new ErrorActionData(this.labelProvider.c(j0.f120788t), params.c()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), 54, null);
            }
            if (errorType == c.b.PIN_AND_PUK_BLOCKED) {
                return new jb4.b.Failure(this.labelProvider.c(j0.f120815z2), this.labelProvider.c(j0.f120744j3), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), 52, null);
            }
            if (errorType == c.b.DATA_INCONSISTENCY) {
                return new jb4.b.Warning(this.labelProvider.c(j0.f120809y0), this.labelProvider.c(j0.f120801w0), null, new ErrorActionData(this.labelProvider.c(j0.f120788t), params.d()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), 52, null);
            }
            if (errorType instanceof c.GenericError) {
                return this.errorMapper.b(new ib4.c.Params(((c.GenericError) errorType).getDomainError(), false, new l() { // from class: iy1.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b.f(params, (ib4.c.b) obj);
                    }
                }, 2, null));
            }
            throw new p();
        }
        return new jb4.b.Failure(this.labelProvider.c(j0.f120769o3), this.labelProvider.c(j0.f120764n3), null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), null, null, new ErrorActionData(this.labelProvider.c(j0.f120725g), params.d()), 52, null);
    }
}
