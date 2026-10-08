package yn;

import ao.h0;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    @Deprecated
    public l() {
    }

    public i e() {
        if (h()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public o f() {
        if (j()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public q g() {
        if (k()) {
            return (q) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean h() {
        return this instanceof i;
    }

    public boolean i() {
        return this instanceof n;
    }

    public boolean j() {
        return this instanceof o;
    }

    public boolean k() {
        return this instanceof q;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ho.c cVar = new ho.c(stringWriter);
            cVar.c0(w.LENIENT);
            h0.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e15) {
            throw new AssertionError(e15);
        }
    }
}
