package zu;

import fr.t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001c"}, d2 = {"Lzu/l;", "Lkotlinx/serialization/json/JsonPrimitive;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "g", "()Z", "isString", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "f", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "coerceToInlineType", "c", "Ljava/lang/String;", "e", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends JsonPrimitive {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SerialDescriptor coerceToInlineType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String content;

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getContent() {
        return this.content;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || l.class != other.getClass()) {
            return false;
        }
        l lVar = (l) other;
        return getIsString() == lVar.getIsString() && t.c(getContent(), lVar.getContent());
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final SerialDescriptor getCoerceToInlineType() {
        return this.coerceToInlineType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getIsString() {
        return this.isString;
    }

    public int hashCode() {
        return (Boolean.hashCode(getIsString()) * 31) + getContent().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (!getIsString()) {
            return getContent();
        }
        StringBuilder sb5 = new StringBuilder();
        av.a.a(sb5, getContent());
        return sb5.toString();
    }
}
