package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.g3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;

/* JADX INFO: loaded from: classes3.dex */
public class g3<MessageType extends l3<MessageType, BuilderType>, BuilderType extends g3<MessageType, BuilderType>> extends s1<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l3 f29726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected l3 f29727b;

    protected g3(MessageType messagetype) {
        this.f29726a = messagetype;
        if (messagetype.F()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f29727b = messagetype.m();
    }

    private static void e(Object obj, Object obj2) {
        z4.a().b(obj.getClass()).V(obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4
    public final boolean c() {
        return l3.E(this.f29727b, false);
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final g3 clone() {
        g3 g3Var = (g3) this.f29726a.I(5, null, null);
        g3Var.f29727b = h();
        return g3Var;
    }

    public final g3 i(l3 l3Var) {
        if (!this.f29726a.equals(l3Var)) {
            if (!this.f29727b.F()) {
                n();
            }
            e(this.f29727b, l3Var);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.q4
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final MessageType k() {
        MessageType messagetype = (MessageType) h();
        if (l3.E(messagetype, true)) {
            return messagetype;
        }
        throw new x5(messagetype);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.q4
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public MessageType h() {
        if (!this.f29727b.F()) {
            return (MessageType) this.f29727b;
        }
        this.f29727b.A();
        return (MessageType) this.f29727b;
    }

    protected final void m() {
        if (this.f29727b.F()) {
            return;
        }
        n();
    }

    protected void n() {
        l3 l3VarM = this.f29726a.m();
        e(l3VarM, this.f29727b);
        this.f29727b = l3VarM;
    }
}
