package androidx.p016lifecycle;

import androidx.p016lifecycle.t0;
import er.a;
import mr.c;
import oq.k;
import p071kotlin.Metadata;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/v0;", "Landroidx/lifecycle/t0;", "VM", "Loq/k;", "Lmr/c;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/x0;", "storeProducer", "Landroidx/lifecycle/w0$c;", "factoryProducer", "Lp7/a;", "extrasProducer", "<init>", "(Lmr/c;Ler/a;Ler/a;Ler/a;)V", "", "c", "()Z", "a", "Lmr/c;", "b", "Ler/a;", "d", "e", "Landroidx/lifecycle/t0;", "cached", "()Landroidx/lifecycle/t0;", "value", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0<VM extends t0> implements k<VM> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c<VM> viewModelClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a<x0> storeProducer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a<w0.c> factoryProducer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a<CreationExtras> extrasProducer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private VM cached;

    /* JADX WARN: Multi-variable type inference failed */
    public v0(c<VM> cVar, a<? extends x0> aVar, a<? extends w0.c> aVar2, a<? extends CreationExtras> aVar3) {
        this.viewModelClass = cVar;
        this.storeProducer = aVar;
        this.factoryProducer = aVar2;
        this.extrasProducer = aVar3;
    }

    @Override // oq.k
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm4 = this.cached;
        if (vm4 != null) {
            return vm4;
        }
        VM vm5 = (VM) w0.INSTANCE.a(this.storeProducer.a(), this.factoryProducer.a(), this.extrasProducer.a()).c(this.viewModelClass);
        this.cached = vm5;
        return vm5;
    }

    @Override // oq.k
    public boolean c() {
        return this.cached != null;
    }
}
