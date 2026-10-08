package cg2;

import dx.b;
import dx.i;
import dx.j;
import ex.d;
import fr.t;
import fu.o;
import java.util.List;
import java.util.concurrent.CancellationException;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import px.f;
import xw.c;

/* JADX INFO: renamed from: cg2.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcg2/a;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GUUIDValidationRule implements hz.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label errorMessage;

    public GUUIDValidationRule(Label label) {
        this.errorMessage = label;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public Label getErrorMessage() {
        return this.errorMessage;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(String value) {
        i left;
        Object objB;
        Object objB2;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    boolean z15 = false;
                    List<String> listI = new o("-").i(value, 0);
                    if (listI.size() == 5 && listI.get(0).length() == 8 && listI.get(1).length() == 4 && listI.get(2).length() == 4 && listI.get(3).length() == 4 && listI.get(4).length() == 12) {
                        z15 = true;
                    }
                    left = new i.Right(Boolean.valueOf(z15));
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    left = new i.Left(objB);
                }
            } catch (ex.c e16) {
                left = new i.Left((b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
            if (left instanceof i.Left) {
                objB2 = Boolean.FALSE;
            } else {
                if (!(left instanceof i.Right)) {
                    throw new p();
                }
                objB2 = ((i.Right) left).b();
            }
            return ((Boolean) objB2).booleanValue();
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GUUIDValidationRule) && t.c(this.errorMessage, ((GUUIDValidationRule) other).errorMessage);
    }

    public int hashCode() {
        return this.errorMessage.hashCode();
    }

    public String toString() {
        return "GUUIDValidationRule(errorMessage=" + this.errorMessage + ')';
    }
}
