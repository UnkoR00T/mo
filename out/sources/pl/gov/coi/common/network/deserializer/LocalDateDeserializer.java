package pl.gov.coi.common.network.deserializer;

import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import java.lang.reflect.Type;
import java.time.LocalDate;
import n00.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpl/gov/coi/common/network/deserializer/LocalDateDeserializer;", "Lcom/google/gson/k;", "Ljava/time/LocalDate;", "<init>", "()V", "Lcom/google/gson/l;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/j;", "context", "b", "(Lcom/google/gson/l;Ljava/lang/reflect/Type;Lcom/google/gson/j;)Ljava/time/LocalDate;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LocalDateDeserializer implements k<LocalDate> {
    @Override // com.google.gson.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LocalDate a(l json, Type typeOfT, j context) {
        try {
            return LocalDate.parse(json.i());
        } catch (Exception unused) {
            return LocalDate.parse(json.i(), b.f129767a);
        }
    }
}
