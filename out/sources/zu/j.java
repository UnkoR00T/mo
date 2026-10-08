package zu;

import fr.q0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\u000b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "encoder", "Loq/i0;", "e", "(Lkotlinx/serialization/encoding/Encoder;)V", "Lzu/k;", "c", "(Lkotlinx/serialization/encoding/Encoder;)Lzu/k;", "Lkotlin/Function0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "deferred", "d", "(Ler/a;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"zu/j$a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "q", "(I)Ljava/lang/String;", "r", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "t", "(I)Z", "a", "Loq/k;", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "s", "()Ljava/lang/String;", "serialName", "Lwu/k;", "k", "()Lwu/k;", "kind", "p", "()I", "elementsCount", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements SerialDescriptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final oq.k original;

        a(er.a<? extends SerialDescriptor> aVar) {
            this.original = oq.l.a(aVar);
        }

        private final SerialDescriptor a() {
            return (SerialDescriptor) this.original.getValue();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* JADX INFO: renamed from: k */
        public wu.k getKind() {
            return a().getKind();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* JADX INFO: renamed from: n */
        public /* bridge */ boolean getIsInline() {
            return super.getIsInline();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public /* bridge */ boolean o() {
            return super.o();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* JADX INFO: renamed from: p */
        public int getElementsCount() {
            return a().getElementsCount();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String q(int index) {
            return a().q(index);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor r(int index) {
            return a().r(index);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* JADX INFO: renamed from: s */
        public String getSerialName() {
            return a().getSerialName();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean t(int index) {
            return a().t(index);
        }
    }

    public static final k c(Encoder encoder) {
        k kVar = encoder instanceof k ? (k) encoder : null;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + q0.c(encoder.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor d(er.a<? extends SerialDescriptor> aVar) {
        return new a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Encoder encoder) {
        c(encoder);
    }
}
