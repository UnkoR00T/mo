package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.az;
import com.google.android.libraries.places.internal.uy;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class uy<MessageType extends az<MessageType, BuilderType>, BuilderType extends uy<MessageType, BuilderType>> extends ex<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final az f33990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected az f33991b;

    protected uy(MessageType messagetype) {
        this.f33990a = messagetype;
        if (messagetype.C()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f33991b = messagetype.E();
    }

    private static void x(Object obj, Object obj2) {
        r00.a().b(obj.getClass()).b(obj, obj2);
    }

    @Override // com.google.android.libraries.places.internal.f00
    public final /* bridge */ /* synthetic */ f00 i2(xx xxVar, ly lyVar) throws IOException {
        if (!this.f33991b.C()) {
            z();
        }
        try {
            r00.a().b(this.f33991b.getClass()).f(this.f33991b, yx.Y(xxVar), lyVar);
            return this;
        } catch (RuntimeException e15) {
            if (e15.getCause() instanceof IOException) {
                throw ((IOException) e15.getCause());
            }
            throw e15;
        }
    }

    @Override // com.google.android.libraries.places.internal.i00
    public final boolean m() {
        return az.H(this.f33991b, false);
    }

    @Override // com.google.android.libraries.places.internal.i00
    public final /* synthetic */ g00 n() {
        return this.f33990a;
    }

    @Override // com.google.android.libraries.places.internal.ex
    protected final /* synthetic */ ex p(fx fxVar) {
        w((az) fxVar);
        return this;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final uy clone() {
        uy uyVar = (uy) this.f33990a.h(5, null, null);
        uyVar.f33991b = u();
        return uyVar;
    }

    @Override // com.google.android.libraries.places.internal.f00
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public MessageType u() {
        if (!this.f33991b.C()) {
            return (MessageType) this.f33991b;
        }
        this.f33991b.k();
        return (MessageType) this.f33991b;
    }

    @Override // com.google.android.libraries.places.internal.f00
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final MessageType H0() {
        MessageType messagetype = (MessageType) u();
        if (messagetype.m()) {
            return messagetype;
        }
        throw new g10(messagetype);
    }

    public final uy w(az azVar) {
        if (!this.f33990a.equals(azVar)) {
            if (!this.f33991b.C()) {
                z();
            }
            x(this.f33991b, azVar);
        }
        return this;
    }

    protected final void y() {
        if (this.f33991b.C()) {
            return;
        }
        z();
    }

    protected void z() {
        az azVarE = this.f33990a.E();
        x(azVarE, this.f33991b);
        this.f33991b = azVarE;
    }
}
