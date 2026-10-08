# GLOSSARY - mObywatel (pakiet pl.nask.mobywatel)

## Aplikacja
- Nazwa: **mObywatel** (label), pakiet R8 `pl.nask.mobywatel`, Application `pl.gov.mc.fringers.mobywatel.MObywatelApplication`.
- „Pulpit" = ekran główny / dashboard mObywatela (z listą dokumentów i skrótami).

## Komponenty (nienazacone)
| Nazwa zaciemniona | Czytelna nazwa | Plik / uwagi |
|---|---|---|
| `pl.gov.mc.fringers.mobywatel.MainActivity` | Główna Activity (launcher + deep linki) | 000_manifest.md |
| `pl.gov.mc.fringers.mobywatel.MObywatelApplication` | Application (DI) | 000_manifest.md |
| `pl.gov.mc.fringers.mobywatel.pushNotification.FirebaseService` | Serwis FCM | 000_manifest.md, 647_ui.md |
| `pl.gov.mc.fringers.mobywatel.manager.job.InactivityLogoutService` | JobService wylogowania po bezczynności | 000_manifest.md |

## Kontrakty/deep linki
- `mobywatel://app/institutions...` - ekran instytucji
- `https://api.mobywatel.gov.pl/application/diia_confirmed` - callback Diia
- `mobywatel://eqsig` - obsługa podpisu kwalifikowanego
- `mobywatel://app/service/pesel_restriction` - ograniczenie PESEL

## Domeny danych (z names.xml, 000_manifest.md)
Dokumenty: mDowód, mPrawo jazdy, Legitymacja Szkolna, Legitymacja Studencka, Karta Dużej Rodziny, Małopolska Karta Aglomeracyjna, Legitymacja Ulgowych Usług Transportowych, Legitymacja emeryta-rencisty, Legitymacja adwokacka, Legitymacja poselska, Unijny Certyfikat COVID, Dokument ochrony czasowej (Diia), Moje pojazdy.

Integracje: Google Maps, ML Kit barcode, Google Places, Google Wallet, Firebase Messaging, Sentry, NFC, biometria.

### OkHttp (paczki 002_net.md)
- `fv.p` -> `okhttp3.Dispatcher` (pulowanie async calli, maxRequests=64, maxRequestsPerHost=5)
- `kv.e` -> `okhttp3.Call`, `kv.e.a` -> `okhttp3.AsyncCall`, `fr.t` -> helper porownania hostow okhttp
- `fv.z` -> `okhttp3.OkHttpClient` (klient HTTP; rejestruje interceptor Sentry `io.sentry.okhttp.b`)
- `fv.a` -> `okhttp3.OkHttpClient.Builder`, `fv.w` -> `okhttp3.Interceptor`, `fv.g` -> `okhttp3.CertificatePinner`

### Retrofit (paczka 007_net.md)
- `ge4.w` -> `retrofit2.ServiceMethod`, `ge4.w.a` -> `retrofit2.ServiceMethod.Builder`, `ge4.s.*` -> `retrofit2.ParameterHandler*`, `c0` -> `retrofit2.Utils/RequestFactory`, `y` -> `retrofit2.Retrofit`
- Zaciemnione adnotacje `ie4.*`: `ie4.f`=@GET, `ie4.o`=@POST, `ie4.b`=@DELETE, `ie4.g`=@HEAD, `ie4.n`=@PATCH, `ie4.p`=@PUT, `ie4.m`=@OPTIONS, `ie4.h`=@HTTP, `ie4.k`=@Headers, `ie4.l`=@Multipart, `ie4.e`=@FormUrlEncoded, `ie4.y`=@Url, `ie4.s`=@Path, `ie4.t`=@Query, `ie4.v`=@QueryName, `ie4.u`=@QueryMap, `ie4.i`=@Field, `ie4.d`=@FieldMap, `ie4.j`=@HeaderMap, `ie4.a`=@Body, `ie4.q`=@Part, `ie4.r`=@PartMap, `ie4.x`=@Tag
