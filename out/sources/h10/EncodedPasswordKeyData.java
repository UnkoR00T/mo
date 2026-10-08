package h10;

import fr.k;
import fr.t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;
import uu.m;
import xu.c;

/* JADX INFO: renamed from: h10.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0018\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u001d"}, d2 = {"Lh10/b;", "", "", "salt", "", "iterations", "<init>", "(Ljava/lang/String;I)V", "self", "Lxu/c;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loq/i0;", "c", "(Lh10/b;Lxu/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "Companion", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@m
public final /* data */ class EncodedPasswordKeyData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String salt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iterations;

    /* JADX INFO: renamed from: h10.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh10/b$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lh10/b;", "serializer", "()Lkotlinx/serialization/KSerializer;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final KSerializer<EncodedPasswordKeyData> serializer() {
            return a.f79631a;
        }

        private Companion() {
        }
    }

    public EncodedPasswordKeyData(String str, int i15) {
        this.salt = str;
        this.iterations = i15;
    }

    public static final /* synthetic */ void c(EncodedPasswordKeyData self, c output, SerialDescriptor serialDesc) {
        output.w(serialDesc, 0, self.salt);
        output.t(serialDesc, 1, self.iterations);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIterations() {
        return this.iterations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSalt() {
        return this.salt;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncodedPasswordKeyData)) {
            return false;
        }
        EncodedPasswordKeyData encodedPasswordKeyData = (EncodedPasswordKeyData) other;
        return t.c(this.salt, encodedPasswordKeyData.salt) && this.iterations == encodedPasswordKeyData.iterations;
    }

    public int hashCode() {
        return (this.salt.hashCode() * 31) + Integer.hashCode(this.iterations);
    }

    public String toString() {
        return "EncodedPasswordKeyData(salt=" + this.salt + ", iterations=" + this.iterations + ')';
    }
}
