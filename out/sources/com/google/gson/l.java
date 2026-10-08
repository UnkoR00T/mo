package com.google.gson;

import java.io.IOException;
import wl.g0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    @Deprecated
    public l() {
    }

    public i e() {
        if (j()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public o f() {
        if (l()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public r g() {
        if (n()) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public Number h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean j() {
        return this instanceof i;
    }

    public boolean k() {
        return this instanceof n;
    }

    public boolean l() {
        return this instanceof o;
    }

    public boolean n() {
        return this instanceof r;
    }

    public String toString() {
        try {
            StringBuilder sb5 = new StringBuilder();
            zl.c cVar = new zl.c(g0.c(sb5));
            cVar.c0(x.LENIENT);
            g0.b(this, cVar);
            return sb5.toString();
        } catch (IOException e15) {
            throw new AssertionError(e15);
        }
    }
}
