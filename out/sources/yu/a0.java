package yu;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lyu/a0;", "Lyu/h1;", "", "name", "Lyu/z;", "generatedSerializer", "<init>", "(Ljava/lang/String;Lyu/z;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "l", "Z", "n", "()Z", "isInline", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends h1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean isInline;

    public a0(String str, z<?> zVar) {
        super(str, zVar, 1);
        this.isInline = true;
    }

    @Override // yu.h1
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a0)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) other;
        if (!fr.t.c(getSerialName(), serialDescriptor.getSerialName())) {
            return false;
        }
        a0 a0Var = (a0) other;
        if (!a0Var.getIsInline() || !Arrays.equals(l(), a0Var.l()) || getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i15 = 0; i15 < elementsCount; i15++) {
            if (!fr.t.c(r(i15).getSerialName(), serialDescriptor.r(i15).getSerialName()) || !fr.t.c(r(i15).getKind(), serialDescriptor.r(i15).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // yu.h1
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // yu.h1, kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getIsInline() {
        return this.isInline;
    }
}
