package jb4;

import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jb4.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ljb4/a;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "Loq/i0;", "action", "<init>", "(Lmx/a;Ler/a;)V", "a", "(Lmx/a;Ler/a;)Ljb4/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "d", "()Lmx/a;", "b", "Ler/a;", "c", "()Ler/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ErrorActionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> action;

    public ErrorActionData(Label label, er.a<i0> aVar) {
        this.label = label;
        this.action = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorActionData b(ErrorActionData errorActionData, Label label, er.a aVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = errorActionData.label;
        }
        if ((i15 & 2) != 0) {
            aVar = errorActionData.action;
        }
        return errorActionData.a(label, aVar);
    }

    public final ErrorActionData a(Label label, er.a<i0> action) {
        return new ErrorActionData(label, action);
    }

    public final er.a<i0> c() {
        return this.action;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorActionData)) {
            return false;
        }
        ErrorActionData errorActionData = (ErrorActionData) other;
        return t.c(this.label, errorActionData.label) && t.c(this.action, errorActionData.action);
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.action.hashCode();
    }

    public String toString() {
        return "ErrorActionData(label=" + this.label + ", action=" + this.action + ")";
    }

    public /* synthetic */ ErrorActionData(Label label, er.a aVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? Label.INSTANCE.c() : label, aVar);
    }
}
