package yy;

import er.l;
import k10.t;
import k10.v;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0000\u0010\u0004*\u00020\u0001\"\b\b\u0001\u0010\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyy/a;", "", "<init>", "()V", "STATE", "EVENT", "initialState", "Lkotlin/Function1;", "Lk10/v;", "Loq/i0;", "transitionGraph", "Lk10/t;", "a", "(Ljava/lang/Object;Ler/l;)Lk10/t;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: Add missing generic type declarations: [STATE, EVENT] */
    /* JADX INFO: renamed from: yy.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"yy/a$a", "Lk10/t;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C6196a<EVENT, STATE> extends t<STATE, EVENT> {
        /* JADX WARN: Multi-variable type inference failed */
        C6196a(l<? super v<STATE, EVENT>, i0> lVar, STATE state) {
            super(state);
            g(lVar);
        }
    }

    public final <STATE, EVENT> t<STATE, EVENT> a(STATE initialState, l<? super v<STATE, EVENT>, i0> transitionGraph) {
        return new C6196a(transitionGraph, initialState);
    }
}
