package t44;

import p071kotlin.Metadata;
import u44.GooglePayTokenModelEntity;
import u44.IntermediateSigningKeyModelEntity;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu44/a;", "Lq44/a$f;", "b", "(Lu44/a;)Lq44/a$f;", "Lu44/b;", "Lq44/a$c;", "a", "(Lu44/b;)Lq44/a$c;", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final q44.a.IntermediateSigningKey a(IntermediateSigningKeyModelEntity intermediateSigningKeyModelEntity) {
        return new q44.a.IntermediateSigningKey(intermediateSigningKeyModelEntity.a(), intermediateSigningKeyModelEntity.getSignedKey());
    }

    public static final q44.a.Token b(GooglePayTokenModelEntity googlePayTokenModelEntity) {
        return new q44.a.Token(a(googlePayTokenModelEntity.getIntermediateSigningKey()), googlePayTokenModelEntity.getProtocolVersion(), googlePayTokenModelEntity.getSignature(), googlePayTokenModelEntity.getSignedMessage());
    }
}
