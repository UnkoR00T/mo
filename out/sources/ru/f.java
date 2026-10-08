package ru;

import er.q;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012J\b\u0002\u0010\f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R<\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\\\u0010\f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R<\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004j\u0002`\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/f;", "Lru/e;", "", "clauseObject", "Lkotlin/Function3;", "Lru/k;", "Loq/i0;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "", "Ltq/i;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Ler/q;Ler/q;)V", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Ler/q;", "()Ler/q;", "c", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object clauseObject;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q<Object, k<?>, Object, i0> regFunc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q<k<?>, Object, Object, q<Throwable, Object, tq.i, i0>> onCancellationConstructor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q<Object, Object, Object, Object> processResFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Object obj, q<Object, ? super k<?>, Object, i0> qVar, q<? super k<?>, Object, Object, ? extends q<? super Throwable, Object, ? super tq.i, i0>> qVar2) {
        this.clauseObject = obj;
        this.regFunc = qVar;
        this.onCancellationConstructor = qVar2;
        this.processResFunc = l.f176155a;
    }

    @Override // ru.i
    public q<Object, k<?>, Object, i0> a() {
        return this.regFunc;
    }

    @Override // ru.i
    public q<k<?>, Object, Object, q<Throwable, Object, tq.i, i0>> b() {
        return this.onCancellationConstructor;
    }

    @Override // ru.i
    public q<Object, Object, Object, Object> c() {
        return this.processResFunc;
    }

    @Override // ru.i
    /* JADX INFO: renamed from: d, reason: from getter */
    public Object getClauseObject() {
        return this.clauseObject;
    }

    public /* synthetic */ f(Object obj, q qVar, q qVar2, int i15, fr.k kVar) {
        this(obj, qVar, (i15 & 4) != 0 ? null : qVar2);
    }
}
