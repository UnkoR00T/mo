# Paczka 000 (manifest)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `AndroidManifest.xml`, `res/values/strings.xml`

## AndroidManifest.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    android:versionCode="56568"
    android:versionName="4.91.0 (6578)"
    android:compileSdkVersion="36"
    android:compileSdkVersionCodename="16"
    android:requiredSplitTypes="base__abi,base__density"
    android:splitTypes=""
    package="pl.nask.mobywatel"
    platformBuildVersionCode="36"
    platformBuildVersionName="16">
    <uses-sdk
        android:minSdkVersion="26"
        android:targetSdkVersion="36"/>
    <uses-feature
        android:name="android.hardware.sensor.accelerometer"
        android:required="true"/>
    <uses-feature
        android:glEsVersion="0x20000"
        android:required="true"/>
    <uses-feature
        android:name="android.hardware.fingerprint"
        android:required="false"/>
    <uses-feature
        android:name="android.hardware.camera"
        android:required="false"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.CAMERA"/>
    <uses-permission android:name="android.permission.USE_BIOMETRIC"/>
    <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED"/>
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
    <uses-permission android:name="android.permission.ACCESS_MEDIA_LOCATION"/>
    <queries>
        <package android:name="ua.gov.diia.app"/>
        <package android:name="pl.gov.cez.mojeikp"/>
        <package android:name="android.media.action.IMAGE_CAPTURE"/>
        <package android:name="android.intent.action.GET_CONTENT"/>
        <intent>
            <action android:name="android.intent.action.SEND"/>
            <data android:mimeType="text/plain"/>
        </intent>
        <intent>
            <action android:name="android.intent.action.SENDTO"/>
            <data android:scheme="mailto"/>
        </intent>
        <package android:name="com.google.android.apps.maps"/>
    </queries>
    <uses-permission android:name="android.permission.USE_FINGERPRINT"/>
    <uses-permission
        android:name="android.permission.BLUETOOTH"
        android:maxSdkVersion="30"/>
    <uses-permission
        android:name="android.permission.WRITE_EXTERNAL_STORAGE"
        android:maxSdkVersion="32"/>
    <uses-permission android:name="android.permission.READ_PHONE_STATE"/>
    <uses-permission
        android:name="android.permission.READ_EXTERNAL_STORAGE"
        android:maxSdkVersion="32"/>
    <uses-permission android:name="android.permission.NFC"/>
    <uses-feature
        android:name="android.hardware.nfc"
        android:required="false"/>
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
    <uses-permission android:name="android.permission.POST_NOTIFICATIONS"/>
    <uses-permission android:name="android.permission.WAKE_LOCK"/>
    <uses-permission android:name="com.google.android.c2dm.permission.RECEIVE"/>
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE"/>
    <permission
        android:name="pl.nask.mobywatel.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
        android:protectionLevel="signature"/>
    <uses-permission android:name="pl.nask.mobywatel.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"/>
    <application
        android:theme="@style/Theme.App.Starting"
        android:label="mObywatel"
        android:icon="@mipmap/ic_launcher"
        android:name="pl.gov.mc.fringers.mobywatel.MObywatelApplication"
        android:allowBackup="false"
        android:largeHeap="true"
        android:supportsRtl="false"
        android:extractNativeLibs="false"
        android:fullBackupContent="@xml/backup_rules"
        android:usesCleartextTraffic="false"
        android:networkSecurityConfig="@xml/network_security_config"
        android:appComponentFactory="androidx.core.app.CoreComponentFactory"
        android:dataExtractionRules="@xml/data_extraction_rules">
        <meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="@string/google_maps_api_key"/>
        <meta-data
            android:name="com.google.android.gms.vision.DEPENDENCIES"
            android:value="barcode"/>
        <meta-data
            android:name="android.webkit.WebView.EnableSafeBrowsing"
            android:value="true"/>
        <meta-data
            android:name="com.google.android.gms.wallet.api.enabled"
            android:value="true"/>
        <activity
            android:name="pl.gov.mc.fringers.mobywatel.MainActivity"
            android:exported="true"
            android:taskAffinity=""
            android:launchMode="singleTask"
            android:windowSoftInputMode="adjustResize">
            <intent-filter>
                <action android:name="android.intent.action.MAIN"/>
                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.DEFAULT"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <data
                    android:scheme="mobywatel"
                    android:host="app"
                    android:pathPrefix="/institutions"/>
            </intent-filter>
            <intent-filter android:autoVerify="true">
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.DEFAULT"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <data
                    android:scheme="https"
                    android:host="api.mobywatel.gov.pl"
                    android:pathPrefix="/application/diia_confirmed"/>
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.DEFAULT"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <data
                    android:scheme="mobywatel"
                    android:host="eqsig"/>
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.DEFAULT"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <data
                    android:scheme="mobywatel"
                    android:host="app"
                    android:path="/service/pesel_restriction"/>
            </intent-filter>
        </activity>
        <activity
            android:theme="@style/OssLicensesTheme"
            android:label="@string/oss_license_title"
            android:name="com.google.android.gms.oss.licenses.OssLicensesMenuActivity"/>
        <activity
            android:theme="@style/OssLicensesTheme"
            android:name="com.google.android.gms.oss.licenses.OssLicensesActivity"/>
        <service
            android:name="pl.gov.mc.fringers.mobywatel.manager.job.InactivityLogoutService"
            android:permission="android.permission.BIND_JOB_SERVICE"/>
        <service
            android:name="pl.gov.coi.mjunior.feature.inactivitylogout.MJuniorInactivityLogoutService"
            android:permission="android.permission.BIND_JOB_SERVICE"/>
        <service
            android:name="pl.gov.mc.fringers.mobywatel.pushNotification.FirebaseService"
            android:exported="false">
            <intent-filter>
                <action android:name="com.google.firebase.MESSAGING_EVENT"/>
            </intent-filter>
        </service>
        <meta-data
            android:name="com.google.firebase.messaging.default_notification_icon"
            android:resource="0x7f080548"/>
        <meta-data
            android:name="com.google.firebase.messaging.default_notification_color"
            android:resource="@color/dark_blue"/>
        <meta-data
            android:name="com.google.firebase.messaging.default_notification_channel_id"
            android:value="general_channel_id"/>
        <provider
            android:name="androidx.core.content.FileProvider"
            android:exported="false"
            android:authorities="pl.nask.mobywatel.provider"
            android:grantUriPermissions="true">
            <meta-data
                android:name="android.support.FILE_PROVIDER_PATHS"
                android:resource="@xml/provider_paths"/>
        </provider>
        <provider
            android:name="androidx.startup.InitializationProvider"
            android:exported="false"
            android:authorities="pl.nask.mobywatel.androidx-startup">
            <meta-data
                android:name="com.google.maps.android.compose.utils.attribution.AttributionIdInitializer"
                android:value="androidx.startup"/>
            <meta-data
                android:name="com.google.maps.android.ktx.utils.attribution.AttributionIdInitializer"
                android:value="androidx.startup"/>
            <meta-data
                android:name="com.google.maps.android.utils.attribution.AttributionIdInitializer"
                android:value="androidx.startup"/>
            <meta-data
                android:name="androidx.emoji2.text.EmojiCompatInitializer"
                android:value="androidx.startup"/>
            <meta-data
                android:name="androidx.p016lifecycle.ProcessLifecycleInitializer"
                android:value="androidx.startup"/>
            <meta-data
                android:name="androidx.profileinstaller.ProfileInstallerInitializer"
                android:value="androidx.startup"/>
        </provider>
        <service
            android:name="androidx.appcompat.app.AppLocalesMetadataHolderService"
            android:enabled="false"
            android:exported="false">
            <meta-data
                android:name="autoStoreLocales"
                android:value="true"/>
        </service>
        <service
            android:name="pl.gov.coi.common.lifecycle.inactivity.InactivityLogoutService"
            android:permission="android.permission.BIND_JOB_SERVICE"
            android:enabled="true"
            android:exported="false"/>
        <meta-data
            android:name="io.sentry.auto-init"
            android:value="false"/>
        <activity
            android:theme="@style/PlacesAutocompleteOverlay"
            android:label="@string/places_autocomplete_label"
            android:name="com.google.android.libraries.places.widget.AutocompleteActivity"
            android:exported="false"
            android:windowSoftInputMode="adjustResize"/>
        <activity
            android:name="com.google.android.libraries.places.widget.BasicPlaceAutocompleteActivity"
            android:exported="false"
            android:windowSoftInputMode="adjustResize"/>
        <activity
            android:name="com.google.android.libraries.places.widget.PlaceAutocompleteActivity"
            android:exported="false"
            android:windowSoftInputMode="adjustResize"/>
        <activity
            android:name="com.google.android.libraries.places.widget.internal.placedetails.photoviewer.PlacesLightboxActivity"
            android:exported="false"
            android:windowSoftInputMode="adjustResize"/>
        <activity
            android:theme="@style/Theme.Material3.DayNight.NoActionBar"
            android:label="@string/oss_license_title"
            android:name="com.google.android.gms.oss.licenses.v2.OssLicensesMenuActivity"/>
        <service
            android:name="androidx.camera.core.impl.MetadataHolderService"
            android:enabled="false"
            android:exported="fal
```

## res/values/strings.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="abc_action_bar_up_description">Navigate up</string>
    <string name="abc_action_mode_done">Done</string>
    <string name="abc_capital_off">OFF</string>
    <string name="abc_capital_on">ON</string>
    <string name="abc_menu_alt_shortcut_label">Alt+</string>
    <string name="abc_menu_ctrl_shortcut_label">Ctrl+</string>
    <string name="abc_menu_delete_shortcut_label">delete</string>
    <string name="abc_menu_enter_shortcut_label">enter</string>
    <string name="abc_menu_function_shortcut_label">Function+</string>
    <string name="abc_menu_meta_shortcut_label">Meta+</string>
    <string name="abc_menu_shift_shortcut_label">Shift+</string>
    <string name="abc_menu_space_shortcut_label">space</string>
    <string name="abc_menu_sym_shortcut_label">Sym+</string>
    <string name="abc_prepend_shortcut_label">Menu+</string>
    <string name="abc_search_hint">Search…</string>
    <string name="abc_searchview_description_clear">Clear query</string>
    <string name="abc_searchview_description_search">Search</string>
    <string name="abc_searchview_description_submit">Submit query</string>
    <string name="abc_searchview_description_voice">Voice search</string>
    <string name="abc_shareactionprovider_share_with">Share with</string>
    <string name="abc_shareactionprovider_share_with_application">Share with %s</string>
    <string name="abc_toolbar_collapse_description">Collapse</string>
    <string name="about_reviews_icon_content_description">About reviews from Google Maps</string>
    <string name="about_these_results_body">When searching for businesses or places near a location, Google Maps will show local results. Several factors - primarily relevance, distance and prominence - are combined to help find the best results for a search.</string>
    <string name="about_these_results_title">About these results</string>
    <string name="accessibilityDeclaration">https://www.gov.pl/web/mobywatel-w-aplikacji/dostepnosc</string>
    <string name="add_document_async_documents_student_dialog_description">Masz legitymacje szkolną i studencką? Możesz dodać tylko jeden z tych dokumentów.</string>
    <string name="add_document_async_documents_student_dialog_title">Dodawanie dokumentu</string>
    <string name="add_document_async_main_result_success_button_primary">Dodaj kolejne dokumenty</string>
    <string name="add_document_async_main_result_success_button_secondary">Przejdź do pulpitu</string>
    <string name="add_document_async_main_result_success_message">Możesz już korzystać z aplikacji lub dodać kolejne dokumenty.</string>
    <string name="add_document_async_main_result_success_title">Twój dokument został dodany</string>
    <string name="add_document_async_result_button_to_documents">Przejdź do dokumentów</string>
    <string name="add_document_async_result_page_info_add_student_button">Dodaj legitymację</string>
    <string name="add_document_async_result_page_info_add_student_dialog_message">Dokument nie zostanie dodany.</string>
    <string name="add_document_async_result_page_info_add_student_dialog_title">Chcesz przerwać dodawanie legitymacji?</string>
    <string name="add_document_async_result_page_info_add_student_message">Aby dodać legitymację szkolną lub studencką, w kolejnym kroku zeskanuj kod QR i wpisz hasło.</string>
    <string name="add_document_async_result_page_info_add_student_title">Trwa dodawanie dokumentów</string>
    <string name="add_document_async_result_page_info_message">W tym czasie możesz korzystać z aplikacji.</string>
    <string name="add_document_async_result_page_info_title">Trwa dodawanie dokumentów</string>
    <string name="add_document_async_result_page_success_add_student_title">Legitymacja została dodana</string>
    <string name="add_document_async_student_school_card_list_info">Masz legitymacje szkolną i studencką? Możesz dodać tylko jeden z tych dokumentów.</string>
    <string name="add_document_confirmation_method_description">Wybierz, w jaki sposób chcesz to zrobić.</string>
    <string name="add_document_confirmation_method_eid_confirmation_description">Użyj plastikowego dowodu osobistego.</string>
    <string name="add_document_confirmation_method_eid_confirmation_title">Dowód osobisty z warstwą elektroniczną (e-dowód)</string>
    <string name="add_document_confirmation_method_office_confirmation_description">Podczas wizyty otrzymasz kod QR. Zeskanuj go, aby urzędnik potwierdził Twoją tożsamość.</string>
    <string name="add_document_confirmation_method_office_confirmation_title">W urzędzie gminy</string>
    <string name="add_document_confirmation_method_online_confirmation_description">Zaloguj się na swoje konto.</string>
    <string name="add_document_confirmation_method_online_confirmation_title">Profil zaufany lub bank</string>
    <string name="add_document_confirmation_method_screen_title">Potwierdzanie tożsamości</string>
    <string name="add_document_confirmation_method_title">Potwierdź tożsamość</string>
    <string name="add_document_generate_certificate_help_contact">mobywatel-pomoc@coi.gov.pl</string>
    <string name="add_document_generate_certificate_loading_title">Generujemy Twój nowy dokument</string>
    <string name="add_document_generate_certificate_navigation_title">Weryfikacja tożsamości</string>
    <string name="add_document_generate_certificate_other_device_dialog_subtitle">To zablokuje dostęp do aplikacji na poprzednim urządzeniu.</string>
    <string name="add_document_generate_certificate_other_device_dialog_subtitle_with_device">To zablokuje dostęp do aplikacji na urządzeniu %s.</string>
    <string name="add_document_generate_certificate_other_device_dialog_title">Chcesz aktywować aplikację na tym urządzeniu?</string>
    <string name="add_document_generate_certificate_remaining_time_and" formatted="false">%d min %02d sek.</string>
    <string name="add_document_generate_certificate_remaining_time_ios" formatted="false">Przewidywany czas: %01i min %02i sek.</string>
    <string name="add_document_generate_certificate_remaining_time_label">Przewidywany czas:</string>
    <string name="add_document_list_attorney_card_title">Legitymacja adwokacka</string>
    <string name="add_document_list_card_id_title">mDowód</string>
    <string name="add_document_list_certified_documents_section_title">Te dokumenty dodasz osobno, bo wymagają potwierdzenia tożsamości.</string>
    <string name="add_document_list_common_documents_section_title">Zaznacz, które dokumenty chcesz dodać.</string>
    <string name="add_document_list_covid_certificate_title">Unijny Certificat COVID</string>
    <string name="add_document_list_deputy_card_title">Legitymacja poselska</string>
    <string name="add_document_list_diia_title">Dokument ochrony czasowej</string>
    <string name="add_document_list_driving_license_subtitle">(również tymczasowe)</string>
    <string name="add_document_list_driving_license_title">mPrawo jazdy</string>
    <string name="add_document_list_empty_state_label">Nie masz dokumentów do dodania</string>
    <string name="add_document_list_large_family_card_title">Karta Dużej Rodziny</string>
    <string name="add_document_list_lesser_poland_city_card_title">Małopolska Karta Aglomeracyjna</string>
    <string name="add_document_list_pensioner_card_title">Legitymacja emeryta-rencisty</string>
    <string name="add_document_list_school_card_title">Legitymacja Szkolna</string>
    <string name="add_document_list_school_student_info_dialog_desc">Nie możesz dodać ich jednocześnie. Dodaj je osobno.</string>
    <string name="add_document_list_school_student_info_dialog_title">Chcesz dodać legitymację szkolną i studencką?</string>
    <string name="add_document_list_student_card_title">Legitymacja Studencka</string>
    <string name="add_document_list_title">Wybierz dokumenty</string>
    <string name="add_document_list_top_bar_title">Dodawanie dokumentów</string>
    <string name="add_document_list_trains_discount_card_title">Legitymacja Ulgowych Usług Transportowych</string>
    <string name="add_document_list_vehicle_title">Moje pojazdy</string>
    <string name="add_document_main_document_screen_diia_card_subtitle">Elektroniczny dokument tożsamości obywateli Ukrainy.</string>
    <string name="add_document_main_document_screen_diia_card_title">Dokument ochrony czasowej</string>
    <string name="add_document_main_document_screen_header_subtitle">Dzięki niemu potwierdzisz tożsamość. Następnie w aplikacji możesz dodać swoje pozostałe dokumenty.</string>
    <string name="add_document_main_document_screen_header_title">Dodaj pierwszy dokument</string>
    <string name="add_document_main_document_screen_identity_card_regulations_first_bullet">mDowód jest ważny 5 lat.</string>
    <string name="add_document_main_document_screen_identity_card_regulations_fourth_bullet">Profil mObywatel umożliwia Ci logowanie do usług online.</string>
    <string name="add_document_main_document_screen_identity_card_regulations_second_bullet">Razem z nim aktywujemy certyfikat i profil mObywatel, które są ważne rok.</string>
    <string name="add_document_main_document_screen_identity_card_regulations_subtitle">Dzięki niemu możesz potwierdzać swoją tożsamość telefonem.</string>
    <string name="add_document_main_document_screen_identity_card_regulations_third_bullet">Certyfikat służy do potwierdzania Twojej tożsamości.</string>
    <string name="add_document_main_document_screen_identity_card_subtitle">Prawnie ważny elektroniczny dokument tożsamości.</string>
    <string name="add_document_main_document_screen_identity_card_title">mDowód</string>
    <string name="add_document_main_document_screen_other_document_subtitle">Dla osób, które nie mają dowodu osobistego.</string>
    <string name="add_document_main_document_screen_other_document_title">Inny dokument</string>
    <string name="add_document_main_document_screen_school_card_subtitle">Elektroniczny dokument potwierdzający status ucznia.</string>
    <string name="add_document_main_document_screen_school_card_title">Legitymacja szkolna</string>
    <string name="add_document_main_document_screen_student_card_subtitle">Elektroniczny dokument potwierdzający status studenta.</string>
    <string name="add_document_main_document_screen_student_card_title">Legitymacja studencka</string>
    <string name="add_document_main_document_secondary_screen_information">W kolejnym kroku potwierdzisz tożsamość kodem QR i hasłem ze szkoły lub uczelni.</string>
    <string name="add_document_migration_error_message">Nie możemy wygenerować mDowodu na podstawie Twojego dotychczasowego certyfikatu. Musisz ponownie potwierdzić swoją tożsamość.</string>
    <string name="add_document_migration_error_title">Wymagana ponowna aktywacja</string>
    <string name="add_document_office_code_expired_title">Kod stracił ważność, wygeneruj go jeszcze raz</string>
    <string name="add_document_office_code_generate_again_label">Wygeneruj kod</string>
    <string name="add_document_office_code_screen_title">Potwierdzanie tożsamości</string>
    <string name="add_document_office_code_valid_title">Pokaż kod urzędnikowi</string>
    <string name="add_document_office_code_validity_time_and" formatted="false">%d min %02d sek.</string>
    <string name="add_document_office_code_validity_time_label">Kod ważny przez:</string>
    <string name="add_document_office_confirmation_find_description">Sprawdź, w których urzędach gminy możesz potwierdzić tożsamość.</string>
    <string name="add_document_office_confirmation_find_title">Zobacz listę urzędów</string>
    <string name="add_document_office_confirmation_generate_code_description">Pokaże Ci go urzędnik.</string>
    <string name="add_document_office_confirmation_generate_code_title">Zeskanuj kod QR</string>
    <string name="add_document_office_confirmation_screen_title">Potwierdzanie tożsamości</string>
    <string name="add_document_office_confirmation_title">Potwierdź tożsamość w ur
```
