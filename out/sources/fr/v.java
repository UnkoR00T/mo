package fr;

import java.lang.reflect.GenericDeclaration;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0012\u001a\u00060\u0002j\u0002`\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00138@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016¨\u0006\u0018"}, d2 = {"Lfr/v;", "Lmr/q;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/internal/TypeParameterContainer;", "a", "Ljava/lang/Object;", "getContainer$kotlin_stdlib", "()Ljava/lang/Object;", "container", "Ljava/lang/reflect/GenericDeclaration;", "b", "Loq/k;", "()Ljava/lang/reflect/GenericDeclaration;", "javaContainingDeclaration", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class v implements mr.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object container;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k javaContainingDeclaration;

    public final GenericDeclaration a() {
        return (GenericDeclaration) this.javaContainingDeclaration.getValue();
    }

    public boolean equals(Object other) {
        if (!(other instanceof v)) {
            return false;
        }
        v vVar = (v) other;
        return t.c(getName(), vVar.getName()) && t.c(this.container, vVar.container);
    }

    public int hashCode() {
        return (this.container.hashCode() * 31) + getName().hashCode();
    }

    public String toString() {
        return x0.INSTANCE.a(this);
    }
}
