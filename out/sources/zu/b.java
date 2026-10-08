package zu;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lzu/b;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "b", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonArray;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "a", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements KSerializer<JsonArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f237669a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SerialDescriptor descriptor = a.f237671b;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lzu/b$a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "", "index", "", "q", "(I)Ljava/lang/String;", "r", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "t", "(I)Z", "c", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "serialName", "Lwu/k;", "k", "()Lwu/k;", "kind", "o", "()Z", "isNullable", "n", "isInline", "p", "()I", "elementsCount", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
    private static final class a implements SerialDescriptor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f237671b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final String serialName = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ SerialDescriptor f237673a = vu.a.h(i.f237674a).getDescriptor();

        private a() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* JADX INFO: renamed from: k */
        public wu.k getKind() {
            return this.f237673a.getKind();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* JADX INFO: renamed from: n */
        public boolean getIsInline() {
            return this.f237673a.getIsInline();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean o() {
            return this.f237673a.o();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* JADX INFO: renamed from: p */
        public int getElementsCount() {
            return this.f237673a.getElementsCount();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String q(int index) {
            return this.f237673a.q(index);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor r(int index) {
            return this.f237673a.r(index);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* JADX INFO: renamed from: s */
        public String getSerialName() {
            return serialName;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean t(int index) {
            return this.f237673a.t(index);
        }
    }

    private b() {
    }

    @Override // uu.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, JsonArray value) {
        j.e(encoder);
        vu.a.h(i.f237674a).serialize(encoder, value);
    }

    @Override // kotlinx.serialization.KSerializer, uu.o
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }
}
