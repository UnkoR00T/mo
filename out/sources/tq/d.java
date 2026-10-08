package tq;

import er.p;
import fr.t;
import java.io.Serializable;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)¨\u0006*"}, d2 = {"Ltq/d;", "Ltq/i;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "Ltq/i$b;", "element", "<init>", "(Ltq/i;Ltq/i$b;)V", "", "d", "()I", "", "b", "(Ltq/i$b;)Z", "context", "c", "(Ltq/d;)Z", "E", "Ltq/i$c;", "key", "m", "(Ltq/i$c;)Ltq/i$b;", "R", "initial", "Lkotlin/Function2;", "operation", "s1", "(Ljava/lang/Object;Ler/p;)Ljava/lang/Object;", "D1", "(Ltq/i$c;)Ltq/i;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "a", "Ltq/i;", "Ltq/i$b;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i.b element;

    public d(i iVar, i.b bVar) {
        this.left = iVar;
        this.element = bVar;
    }

    private final boolean b(i.b element) {
        return t.c(m(element.getKey()), element);
    }

    private final boolean c(d context) {
        while (b(context.element)) {
            i iVar = context.left;
            if (!(iVar instanceof d)) {
                return b((i.b) iVar);
            }
            context = (d) iVar;
        }
        return false;
    }

    private final int d() {
        int i15 = 2;
        d dVar = this;
        while (true) {
            i iVar = dVar.left;
            dVar = iVar instanceof d ? (d) iVar : null;
            if (dVar == null) {
                return i15;
            }
            i15++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String str, i.b bVar) {
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    @Override // tq.i
    public i D1(i.c<?> key) {
        if (this.element.m(key) != null) {
            return this.left;
        }
        i iVarD1 = this.left.D1(key);
        if (iVarD1 == this.left) {
            return this;
        }
        return iVarD1 == j.f191408a ? this.element : new d(iVarD1, this.element);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return dVar.d() == d() && dVar.c(this);
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @Override // tq.i
    public <E extends i.b> E m(i.c<E> key) {
        d dVar = this;
        while (true) {
            E e15 = (E) dVar.element.m(key);
            if (e15 != null) {
                return e15;
            }
            i iVar = dVar.left;
            if (!(iVar instanceof d)) {
                return (E) iVar.m(key);
            }
            dVar = (d) iVar;
        }
    }

    @Override // tq.i
    public /* bridge */ i n0(i iVar) {
        return i.a.b(this, iVar);
    }

    @Override // tq.i
    public <R> R s1(R initial, p<? super R, ? super i.b, ? extends R> operation) {
        return operation.B((Object) this.left.s1(initial, operation), this.element);
    }

    public String toString() {
        return '[' + ((String) s1("", new p() { // from class: tq.c
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return d.e((String) obj, (i.b) obj2);
            }
        })) + ']';
    }
}
