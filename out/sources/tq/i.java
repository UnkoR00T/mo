package tq;

import er.p;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Ltq/i;", "", "Ltq/i$b;", "E", "Ltq/i$c;", "key", "m", "(Ltq/i$c;)Ltq/i$b;", "R", "initial", "Lkotlin/Function2;", "operation", "s1", "(Ljava/lang/Object;Ler/p;)Ljava/lang/Object;", "context", "n0", "(Ltq/i;)Ltq/i;", "D1", "(Ltq/i$c;)Ltq/i;", "c", "b", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface i {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public static i b(i iVar, i iVar2) {
            return iVar2 == j.f191408a ? iVar : (i) iVar2.s1(iVar, new p() { // from class: tq.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.a.c((i) obj, (i.b) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i c(i iVar, b bVar) {
            i iVarD1 = iVar.D1(bVar.getKey());
            j jVar = j.f191408a;
            if (iVarD1 == jVar) {
                return bVar;
            }
            f.Companion bVar2 = f.INSTANCE;
            f fVar = (f) iVarD1.m(bVar2);
            if (fVar == null) {
                return new d(iVarD1, bVar);
            }
            i iVarD2 = iVarD1.D1(bVar2);
            return iVarD2 == jVar ? new d(bVar, fVar) : new d(new d(iVarD2, bVar), fVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltq/i$b;", "Ltq/i;", "E", "Ltq/i$c;", "key", "m", "(Ltq/i$c;)Ltq/i$b;", "getKey", "()Ltq/i$c;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface b extends i {

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public static <R> R a(b bVar, R r15, p<? super R, ? super b, ? extends R> pVar) {
                return pVar.B(r15, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                if (t.c(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static i c(b bVar, c<?> cVar) {
                return t.c(bVar.getKey(), cVar) ? j.f191408a : bVar;
            }

            public static i d(b bVar, i iVar) {
                return a.b(bVar, iVar);
            }
        }

        c<?> getKey();

        @Override // tq.i
        <E extends b> E m(c<E> key);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Ltq/i$c;", "Ltq/i$b;", "E", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface c<E extends b> {
    }

    i D1(c<?> key);

    <E extends b> E m(c<E> key);

    i n0(i context);

    <R> R s1(R initial, p<? super R, ? super b, ? extends R> operation);
}
